package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of integers arr, return true if the number of occurrences of each value
 * in the array is unique, or false otherwise.
 */
class UniqueNumberOfOccurrences(private val arr: IntArray) : Solution<Boolean> {

    override fun getResult(): Boolean {

        val map = mutableMapOf<Int, Int>()

        arr.forEach { num ->
            map.put(num, map.getOrDefault(num, 0) + 1)
        }

        return map.values.groupBy { value -> value }
            .filter { numRepeat -> numRepeat.value.size > 1 }
            .isEmpty()
    }
}