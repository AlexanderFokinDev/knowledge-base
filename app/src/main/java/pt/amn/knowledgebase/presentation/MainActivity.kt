package pt.amn.knowledgebase.presentation

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import pt.amn.knowledgebase.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    private var networkBroadcastReceiver: BroadcastReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host: NavHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment? ?: return
        navController = host.navController

        networkBroadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                navController.navigate(R.id.broadcastReceiverFragment)
            }
        }

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also { filter ->
            registerReceiver(networkBroadcastReceiver, filter)
        }
    }

    override fun onDestroy() {

        unregisterReceiver(networkBroadcastReceiver)
        networkBroadcastReceiver = null

        super.onDestroy()
    }
}