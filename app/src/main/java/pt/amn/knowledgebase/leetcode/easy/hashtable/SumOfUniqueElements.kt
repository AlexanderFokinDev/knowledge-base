package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an integer array nums. The unique elements of an array are the elements
 * that appear exactly once in the array.
 *
 * Return the sum of all the unique elements of nums.
 */
class SumOfUniqueElements(private val nums: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        val map = mutableMapOf<Int, Boolean>()
        var result = 0

        nums.forEach { num ->
            if (map.containsKey(num)) {
                map.put(num, false)
            } else {
                map.put(num, true)
            }
        }

        map.filter { el ->
            el.value
        }.forEach { elFiltered ->
            result += elFiltered.key
        }

        return result
    }
}