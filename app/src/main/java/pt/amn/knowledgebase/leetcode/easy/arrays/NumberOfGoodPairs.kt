package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of integers nums, return the number of good pairs.
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
class NumberOfGoodPairs(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        var result = 0

        for ((i, valueI) in nums.withIndex()) {

            for ((j, valueJ) in nums.withIndex()) {

                if (i < j && valueI == valueJ) result++

            }
        }

        return result
    }
}