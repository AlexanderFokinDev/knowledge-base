package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 */
class CountTheNumberOfConsistentStrings(
    private val allowed: String,
    private val words: Array<String>
) : Solution<Int> {

    override fun getResult(): Int {

        var result = 0
        val allowedSet = allowed.toSet()
        val sizeAllowSet = allowedSet.size

        words.forEach { word ->
            if(allowedSet.union(word.toSet()).size == sizeAllowSet) result++
        }

        return result
    }
}