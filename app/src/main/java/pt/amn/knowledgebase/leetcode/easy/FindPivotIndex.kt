package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left
 * of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are
 * no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
class FindPivotIndex(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        var leftSum = 0
        var rightSum = 0

        for ((pivotIndex, num) in nums.withIndex()) {
            leftSum = getSumElements(nums, 0, pivotIndex-1)
            rightSum = getSumElements(nums, pivotIndex+1, nums.size-1)
            if (leftSum == rightSum) {
                return pivotIndex
            }
        }

        return -1
    }

    private fun getSumElements(nums: IntArray, startIndex: Int, endIndex: Int) : Int {

        if (endIndex < 0 || endIndex >= nums.size) {
            return 0
        }

        var sum = 0
        for (index in startIndex..endIndex) {
            sum += nums[index]
        }
        return sum
    }
}