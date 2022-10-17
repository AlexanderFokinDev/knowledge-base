package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a string of English letters s, return the greatest English letter which occurs as both
 * a lowercase and uppercase letter in s. The returned letter should be in uppercase.
 * If no such letter exists, return an empty string.
 *
 * An English letter b is greater than another letter a if b appears after a in the English alphabet.
 */
class GreatestEnglishLetterInUpperAndLowerCase(private val s: String) : Solution<String> {

    override fun getResult(): String {

        val symbolsMap = hashSetOf<Char>()
        s.forEach { symbol ->
            symbolsMap.add(symbol)
        }

        for (symbol in 'z' downTo 'a') {
            if (symbolsMap.contains(symbol) && symbolsMap.contains(symbol.uppercaseChar())) {
                return symbol.uppercase()
            }
        }

        return ""
    }
}