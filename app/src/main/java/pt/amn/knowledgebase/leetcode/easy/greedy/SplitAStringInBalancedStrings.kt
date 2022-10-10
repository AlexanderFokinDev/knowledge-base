package pt.amn.knowledgebase.leetcode.easy.greedy

import pt.amn.knowledgebase.leetcode.Solution
import java.util.*
import kotlin.math.min

/**
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 *
 * Given a balanced string s, split it into some number of substrings such that:
 *
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 */
class SplitAStringInBalancedStrings(private val s: String) : Solution<Int> {

    override fun getResult(): Int {

        var countBalanced = 0
        var countSymbolR = 0
        var countSymbolL = 0

        s.forEach { symbol ->

            if (symbol == 'R') countSymbolR++
            if (symbol == 'L') countSymbolL++

            // check balance
            if (countSymbolL == countSymbolR) {
                countBalanced++
                countSymbolR = 0
                countSymbolL = 0
            }

        }

        return countBalanced
    }
}