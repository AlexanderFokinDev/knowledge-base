package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two arrays of integers nums and index. Your task is to create target array
 * under the following rules:
 *
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i]
 * the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.
 *
 * It is guaranteed that the insertion operations will be valid.
 */
class CreateTargetArrayInTheGivenOrder(private val nums: IntArray, private val index: IntArray) :
    Solution<IntArray> {

    override fun getResult(): IntArray {

        val resultList: MutableList<Int> = mutableListOf()

        for (i in nums.indices) {
            val index = index[i]
            val num = nums[i]

            resultList.add(index, num)
        }

        return resultList.toIntArray()
    }
}