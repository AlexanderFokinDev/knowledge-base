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

        val hashMap1 = hashMapOf(1 to "one", 2 to "two", 3 to "three")
        val hashMap2 = hashMapOf(1 to "one", 2 to "two", 3 to "three")
        val hashMap3 = hashMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four")
        val hashMap4 = hashMapOf(1 to "one", 4 to "four")

        println("hashMap1 = hashMap2: " + (hashMap1 == hashMap2))
        println("hashMap1.get(2): " + hashMap1.get(2))
        println("hashMap3.containsKey(5): " + hashMap3.containsKey(5))
        println("hashMap4.put(5, \"five\"): " + hashMap4.put(5, "five"))

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

    fun queueResearch() {

        val queue: Queue<String> = LinkedList<String>()
        println("add First")
        queue.add("First")
        println(queue)
        println("add Second")
        queue.add("Second")
        println(queue)
        println("queue.peek()" + queue.peek())
        println("add Third")
        queue.add("Third")
        println(queue)
        println("queue.peek()" + queue.peek())
        println("remove")
        queue.remove()
        println(queue)
        println("queue.peek()" + queue.peek())

    }
}