package pt.amn.knowledgebase.leetcode.easy

import android.os.Build.VERSION_CODES.M
import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving
 * the order of characters. No two characters may map to the same character,
 * but a character may map to itself.
 */
class IsomorphicStrings(private var s: String, private val t: String) : Solution<Boolean> {

    override fun getResult(): Boolean {

        val usedSymbols: MutableMap<Char, Char> = mutableMapOf()
        var newWord = ""

        for ((index, symbol) in s.withIndex()) {

            val findedSymbol = usedSymbols.get(symbol)
            if(findedSymbol == null) {
                if (usedSymbols.containsValue(t[index])) return false
                usedSymbols.put(symbol, t[index])
                newWord += t[index]
            } else
            {
                newWord += findedSymbol
            }

        }

        return t == newWord
    }
}