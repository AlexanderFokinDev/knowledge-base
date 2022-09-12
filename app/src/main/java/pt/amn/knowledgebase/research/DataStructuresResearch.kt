package pt.amn.knowledgebase.research

import java.util.*
import kotlin.collections.ArrayList

class DataStructuresResearch {

    fun arrayListResearch() : Int {

        val arrayList = ArrayList<Int>()
        arrayList.add(1)
        println(arrayList.size)
        arrayList.add(2)
        println(arrayList.size)

        // Increase a capacity
        arrayList.ensureCapacity(5)
        println(arrayList.size)

        return arrayList.size
    }

    fun linkedListResearch() : Int {

        val linkedList = LinkedList<Int>()
        linkedList.add(1)
        linkedList.add(3)
        linkedList.add(1, 2)
        println(linkedList)

        println("first: ${linkedList.first}")
        println("last: ${linkedList.last}")
        println("peekFirst(): ${linkedList.peekFirst()}")

        return linkedList.size
    }

    fun linkedHashMapResearch() {

    }

    fun hashMapResearch() {

    }

    fun linkedHashSetResearch() {

    }

    fun hashSetResearch() {

    }
}