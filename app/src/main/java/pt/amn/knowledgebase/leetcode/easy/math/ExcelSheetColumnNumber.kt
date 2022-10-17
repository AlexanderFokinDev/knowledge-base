package pt.amn.knowledgebase.leetcode.easy.math

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet,
 * return its corresponding column number.
 *
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
class ExcelSheetColumnNumber(val columnTitle: String) : Solution<Int> {
    override fun getResult(): Int {

        val mapAlfabet = mutableMapOf<Char, Int>()
        var value = 0
        for (symbol in 'A'..'Z' ) {
            value++
            mapAlfabet.put(symbol, value)
        }

        var result = 0
        val symLength = columnTitle.length
        var multiplicator = 1
        for (symNum in symLength-1 downTo 0) {
            result += (mapAlfabet[columnTitle[symNum]] ?: 0) * multiplicator
            multiplicator *= 26
        }

        return result
    }
}