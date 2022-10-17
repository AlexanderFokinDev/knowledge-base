package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
class MajorityElement(val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        for ((key, value) in nums.groupBy { it }) {
            if (value.size > nums.size / 2) return key
        }

        return nums[0]
    }
}