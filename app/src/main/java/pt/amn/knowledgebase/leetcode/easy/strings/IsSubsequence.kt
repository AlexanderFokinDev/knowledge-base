package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string
 * by deleting some (can be none) of the characters without disturbing the relative
 * positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
class IsSubsequence(private val s: String, private val t: String) : Solution<Boolean> {

    override fun getResult(): Boolean {

        var indexT = 0
        var symbolFinded: Boolean
        for (symbol in s) {
            symbolFinded = false
            while (indexT < t.length) {
                if (symbol == t[indexT]) {
                    symbolFinded = true
                    indexT++
                    break
                }
                indexT++
            }
            if (!symbolFinded) {
                return false
            }
        }

        return true
    }
}