package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an integer array nums with the following properties:
 *
 * nums.length == 2 * n.
 * nums contains n + 1 unique elements.
 * Exactly one element of nums is repeated n times.
 * Return the element that is repeated n times.
 */
class NRepeatedElementInSize2NArray(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        val map = hashMapOf<Int, Int>()

        for (num in nums) {
            val value = map.getOrDefault(num, 0)
            map[num] = value + 1
        }

        map.filter { el ->
            el.value == nums.size / 2
        }.forEach { el ->
            return el.key
        }

        return 0
    }
}