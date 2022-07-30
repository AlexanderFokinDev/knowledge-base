package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word
 * or phrase, typically using all the original letters exactly once.
 */
class ValidAnagram(val s: String, val t: String) : Solution<Boolean> {

    override fun getResult(): Boolean {

        if (s.length != t.length) return false

        val mutableMap = mutableMapOf<Char, Int>()
        for (letter in s) {
            val foundLetter = mutableMap.get(letter)
            if (foundLetter != null) {
                mutableMap.put(letter, foundLetter + 1)
            } else {
                mutableMap.put(letter, 1)
            }
        }

        for (letterT in t) {
            val result = mutableMap.get(letterT)
            if (result == null || result == 0) {
                return false
            } else {
                mutableMap.put(letterT, result - 1)
            }
        }

        return true
    }
}