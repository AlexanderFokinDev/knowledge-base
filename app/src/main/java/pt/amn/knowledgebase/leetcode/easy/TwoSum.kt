package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 **/
class TwoSum(private val nums: IntArray, private val target: Int) : Solution<IntArray> {

    override fun getResult(): IntArray {

        for ((index, num) in nums.withIndex()) {

            for ((innerIndex, innernum) in nums.withIndex()) {

                if (index != innerIndex) {
                    if (num + innernum == target) {
                        return intArrayOf(index, innerIndex)
                    }
                }

            }

        }

        return intArrayOf()

    }
}