package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an array of integers nums. You are also given an integer original which is the
 * first number that needs to be searched for in nums.
 *
 * You then do the following steps:
 *
 * If original is found in nums, multiply it by two (i.e., set original = 2 * original).
 * Otherwise, stop the process.
 * Repeat this process with the new number as long as you keep finding the number.
 * Return the final value of original.
 */
class KeepMultiplyingFoundValuesByTwo(private val nums: IntArray, private val original: Int) :
    Solution<Int> {

    override fun getResult(): Int {

        var newOriginal = original

        nums.sort()
        nums.forEach { num ->
            if (num == newOriginal) {
                newOriginal = num * 2
            }
        }

        return newOriginal
    }
}