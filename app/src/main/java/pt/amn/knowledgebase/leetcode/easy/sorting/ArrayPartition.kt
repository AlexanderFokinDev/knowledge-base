package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution
import java.lang.Integer.min

/**
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1),
 * (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized.
 * Return the maximized sum.
 */
class ArrayPartition(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        var result = 0

        nums.sort()
        for (i in nums.indices step 2) {
            result += min(nums[i], nums[i+1])
        }

        return result
    }
}