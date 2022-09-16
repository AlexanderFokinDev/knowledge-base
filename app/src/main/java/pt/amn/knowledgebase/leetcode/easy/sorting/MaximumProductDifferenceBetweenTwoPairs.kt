package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 *
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
 * Given an integer array nums, choose four distinct indices w, x, y, and z such that
 * the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
 *
 * Return the maximum such product difference.
 */
class MaximumProductDifferenceBetweenTwoPairs(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        nums.sort()

        val w = nums[nums.size - 1]
        val x = nums[nums.size - 2]
        val y = nums[0]
        val z = nums[1]

        return ((w*x) - (y*z))
    }
}