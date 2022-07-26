package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 */
class FirstUniqueCharacterInString(val s: String) : Solution<Int> {

    override fun getResult(): Int {
        val groupSymbols = s.groupBy { it }

        for ((index, symbol) in s.withIndex()) {
            val findedSymbol = groupSymbols.get(symbol)
            if ((findedSymbol?.size ?: -1) == 1) return index
        }

        return -1
    }
}