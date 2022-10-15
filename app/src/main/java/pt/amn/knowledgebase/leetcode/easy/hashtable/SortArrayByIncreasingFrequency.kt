package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of integers nums, sort the array in increasing order based on the frequency
 * of the values. If multiple values have the same frequency, sort them in decreasing order.
 *
 * Return the sorted array.
 */
class SortArrayByIncreasingFrequency(private val nums: IntArray) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val freqMap = hashMapOf<Int, Int>()

        nums.forEach { num ->
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1)
        }

        val sortedList =
            freqMap.map { it.key to it.value }.sortedWith(compareBy({ it.second }, { -it.first }))

        val result = IntArray(nums.size)

        var index = 0
        for (el in sortedList) {
            for (i in 1..el.second) {
                result[index] = el.first
                index++
            }
        }
        return result
    }
}