package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a non-negative integer array nums. In one operation, you must:
 *
 * Choose a positive integer x such that x is less than or equal to the smallest non-zero
 * element in nums.
 * Subtract x from every positive element in nums.
 * Return the minimum number of operations to make every element in nums equal to 0.
 */
class MakeArrayZeroBySubtractingEqualAmounts(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        var countSteps = 0
        var minNum = 0

        do {
            minNum = nums.filter { num ->
                num > 0
            }.minOrNull() ?: 0

            if (minNum > 0) {
                countSteps++
                for ((index, num) in nums.withIndex()) {

                    if (num > 0) {
                        nums[index] = num - minNum
                    }
                }
            }
        } while (minNum > 0)

        return countSteps
    }
}