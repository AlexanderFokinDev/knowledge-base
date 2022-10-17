package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 *
 * Note:
 *
 * A letter a appears twice before another letter b if the second occurrence of a is before
 * the second occurrence of b.
 * s will contain at least one letter that appears twice.
 */
class FirstLetterToAppearTwice(private val s: String) : Solution<Char> {

    override fun getResult(): Char {

        val charMap = mutableSetOf<Char>()

        for (symbol in s) {
            if (charMap.contains(symbol)) return symbol
            charMap.add(symbol)
        }

        return ' '
    }
}