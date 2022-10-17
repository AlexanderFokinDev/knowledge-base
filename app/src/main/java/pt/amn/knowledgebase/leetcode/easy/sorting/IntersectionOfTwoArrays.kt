package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
class IntersectionOfTwoArrays(private val nums1: IntArray, private val nums2: IntArray) :
    Solution<IntArray> {

    override fun getResult(): IntArray {

        nums1.sort()
        nums2.sort()

        val result = mutableSetOf<Int>()

        nums1.forEach { num1 ->
            if (nums2.find { num2 ->
                num2 == num1 } != null) {
                result.add(num1)
            }
        }

        return result.toIntArray()
    }
}