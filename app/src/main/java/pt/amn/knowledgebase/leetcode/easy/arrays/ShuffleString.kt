package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves
 * to indices[i] in the shuffled string.
 *
 * Return the shuffled string.
 */
class ShuffleString(private val s: String, private val indices: IntArray) : Solution<String> {

    override fun getResult(): String {

        val array = CharArray(s.length)

        for ((i, num) in indices.withIndex()) {
            array[num] = s[i]
        }

        return String(array)
    }
}