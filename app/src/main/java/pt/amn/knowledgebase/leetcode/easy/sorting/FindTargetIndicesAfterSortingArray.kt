package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a 0-indexed integer array nums and a target element target.
 *
 * A target index is an index i such that nums[i] == target.
 *
 * Return a list of the target indices of nums after sorting nums in non-decreasing order.
 * If there are no target indices, return an empty list.
 * The returned list must be sorted in increasing order.
 */
class FindTargetIndicesAfterSortingArray(private val nums: IntArray, private val target: Int) :
    Solution<List<Int>> {

    override fun getResult(): List<Int> {

        val resultList = mutableListOf<Int>()

        nums.sort()

        for ((index, number) in nums.withIndex()) {
            if (number == target) resultList.add(index)
        }

        resultList.sort()

        return resultList
    }
}