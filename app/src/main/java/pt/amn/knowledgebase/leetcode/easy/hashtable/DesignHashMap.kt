package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Design a HashMap without using any built-in hash table libraries.
 *
 * Implement the MyHashMap class:
 *
 * MyHashMap() initializes the object with an empty map.
 * void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already
 * exists in the map, update the corresponding value.
 * int get(int key) returns the value to which the specified key is mapped, or -1 if this
 * map contains no mapping for the key.
 * void remove(key) removes the key and its corresponding value if the map contains
 * the mapping for the key.
 */
class DesignHashMap() : Solution<Map<Int, Int>> {

    override fun getResult(): Map<Int, Int> {

        val myHashMap = MyHashMap()
        myHashMap.put(1, 1) // The map is now [[1,1]]
        myHashMap.put(2, 2) // The map is now [[1,1], [2,2]]
        myHashMap.get(1)    // return 1, The map is now [[1,1], [2,2]]
        myHashMap.get(3)    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1) // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        myHashMap.get(2)    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2) // remove the mapping for 2, The map is now [[1,1]]
        myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]

        return myHashMap.getMap()
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
class MyHashMap {

    private val map = arrayOfNulls<Int>(1000001)

    fun put(key: Int, value: Int) {
        map[key] = value
    }

    fun get(key: Int): Int {
        return map[key] ?: -1
    }

    fun remove(key: Int) {
        map[key] = null
    }

    fun getMap() : Map<Int, Int> {
        val newMap = mutableMapOf<Int, Int>()
        for((index, el) in map.withIndex()) {
            if (el != null) {
                newMap.put(index, el)
            }
        }

        return newMap
    }

}