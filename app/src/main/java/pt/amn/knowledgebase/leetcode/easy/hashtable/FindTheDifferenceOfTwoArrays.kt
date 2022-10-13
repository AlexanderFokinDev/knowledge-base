package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 */
class FindTheDifferenceOfTwoArrays(private val nums1: IntArray, private val nums2: IntArray) :
    Solution<List<List<Int>>> {

    override fun getResult(): List<List<Int>> {

        val set1 = nums1.toSet()
        val set2 = nums2.toSet()

        return listOf(
            set1.subtract(set2).toList(),
            set2.subtract(set1).toList()
        )

    }
}