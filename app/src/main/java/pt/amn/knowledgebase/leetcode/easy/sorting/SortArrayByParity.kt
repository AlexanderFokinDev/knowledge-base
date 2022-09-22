package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed
 * by all the odd integers.
 *
 * Return any array that satisfies this condition.
 */
class SortArrayByParity(private val nums: IntArray) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val resultArray = IntArray(nums.size) {0}

        var startIndex = 0
        var endIndex = nums.size - 1
        for (num in nums) {
            if (num % 2 == 0) {
                resultArray[startIndex] = num
                startIndex++
            } else {
                resultArray[endIndex] = num
                endIndex--
            }
        }

        return resultArray
    }
}