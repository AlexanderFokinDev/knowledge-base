package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
class FindAllAnagramsInAString(private val s: String, private val p: String) : Solution<List<Int>> {

    override fun getResult(): List<Int> {

        val pc = IntArray('z' - 'a' + 1)
        for (i in p) pc[i - 'a']++
        val result = mutableListOf<Int>()

        for (i in s.indices) {
            pc[s[i] - 'a']--
            if (i >= p.length) pc[s[i - p.length] - 'a']++
            if (pc.all { it == 0 }) result.add(i - p.length + 1)
        }

        return result
    }
}