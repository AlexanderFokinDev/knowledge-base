package pt.amn.knowledgebase.presentation

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.amn.knowledgebase.databinding.FragmentThreadsBinding

class ThreadsFragment : Fragment() {

    private var _binding: FragmentThreadsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThreadsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btThreadStart.setOnClickListener {
            researchOfUIHandler()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun researchOfUIHandler() {

        val handler = Handler(Looper.getMainLooper())

        Thread {
            for (i in 1..COUNT_ITERATIONS) {

                handler.post(Runnable {
                    binding.tvThreadInfo.text = i.toString()
                })
                Thread.sleep(1000)
            }
        }.start()
    }

    companion object {
        private const val COUNT_ITERATIONS = 10
    }
}