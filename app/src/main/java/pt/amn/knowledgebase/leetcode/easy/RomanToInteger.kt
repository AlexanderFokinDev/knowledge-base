package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together.
    12 is written as XII, which is simply X + II.
    The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII. Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.
 */
class RomanToInteger(val romanStr: String) : Solution<Int> {
    override fun getResult(): Int {
        var result = 0
        var lastSymbol = ' '
        for(s in romanStr) {
            result +=
            when(s) {
                'M' -> if(lastSymbol == 'C') 800 else 1000
                'D' -> if(lastSymbol == 'C') 300 else 500
                'C' -> if(lastSymbol == 'X') 80 else 100
                'L' -> if(lastSymbol == 'X') 30 else 50
                'X' -> if(lastSymbol == 'I') 8 else 10
                'V' -> if(lastSymbol == 'I') 3 else 5
                'I' -> 1
                else -> 0
            }
            lastSymbol = s
        }

        return result
    }
}