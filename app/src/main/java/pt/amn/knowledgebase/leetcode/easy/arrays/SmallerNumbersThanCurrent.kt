package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller
 * than it. That is, for each nums[i] you have to count the number of valid j's such that
 * j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 */
class SmallerNumbersThanCurrent(private val nums: IntArray) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val resultArray = IntArray(nums.size)

        for ((i, value1) in nums.withIndex()) {

            for ((j, value2) in nums.withIndex()) {

                if (i != j && value2 < value1){
                    resultArray[i]++
                }
            }
        }

        return resultArray

    }
}