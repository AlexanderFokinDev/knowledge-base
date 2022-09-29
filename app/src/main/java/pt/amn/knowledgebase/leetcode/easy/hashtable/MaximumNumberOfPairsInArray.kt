package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a 0-indexed integer array nums. In one operation, you may do the following:
 *
 * Choose two integers in nums that are equal.
 * Remove both integers from nums, forming a pair.
 * The operation is done on nums as many times as possible.
 *
 * Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs
 * that are formed and answer[1] is the number of leftover integers in nums after doing
 * the operation as many times as possible.
 */
class MaximumNumberOfPairsInArray(private val nums: IntArray) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val mapNums = hashMapOf<Int, Int>()

        for (num in nums) {
            mapNums[num] = mapNums.getOrDefault(num, 0) + 1
        }

        var countPair = 0
        var leftover = 0
        mapNums.forEach { el ->
            countPair += el.value / 2
            if (el.value % 2 != 0) leftover++
        }

        return intArrayOf(countPair, leftover)
    }
}