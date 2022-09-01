package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 *
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
 * For each such pair, there are freq elements with value val concatenated in a sublist.
 * Concatenate all the sublists from left to right to generate the decompressed list.
 *
 * Return the decompressed list.
 */
class DecompressRunLengthEncodedList(private val nums: IntArray) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val result = mutableListOf<Int>()

        for (i in 0 until nums.size step 2) {
            for (fNum in 0 until nums[i]) {
                result.add(nums[i+1])
            }
        }

        return result.toIntArray()
    }
}