package pt.amn.knowledgebase.research

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

    fun linkedHashMapResearch() {

    }

    fun hashMapResearch() {

    }

    fun linkedHashSetResearch() {

    }

    fun hashSetResearch() {

    }
}