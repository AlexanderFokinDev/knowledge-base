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

        val hashSet1 = hashSetOf(1, 2, 3)
        val hashSet2 = hashSetOf(1, 2, 3)
        val hashSet3 = hashSetOf(1, 2, 3, 4)
        val hashSet4 = hashSetOf(1, 4)

        println("hashSet1 = hashSet2: " + (hashSet1 == hashSet2))
        println("hashSet1(1, 2, 3).union(hashSet2(1, 2, 3)): " + hashSet1.union(hashSet2))
        println("hashSet3(1, 2, 3, 4).intersect(hashSet4(1, 4)): " + hashSet3.intersect(hashSet4))

    }
}