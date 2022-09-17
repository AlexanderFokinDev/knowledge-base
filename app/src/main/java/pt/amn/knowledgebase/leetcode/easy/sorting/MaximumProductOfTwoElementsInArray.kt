package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the array of integers nums, you will choose two different indices i and j of that array.
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */
class MaximumProductOfTwoElementsInArray(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        nums.sortDescending()

        return (nums[0] - 1) * (nums[1] - 1)
    }
}