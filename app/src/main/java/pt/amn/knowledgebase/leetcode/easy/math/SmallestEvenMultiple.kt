package pt.amn.knowledgebase.leetcode.easy.math

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a positive integer n, return the smallest positive integer that
 * is a multiple of both 2 and n.
 */
class SmallestEvenMultiple(private val n: Int) : Solution<Int> {

    override fun getResult(): Int {

        var num = n
        do {
            if (num % 2 == 0) {
                return num
            } else {
                num *= 2
            }
        } while (num < Integer.MAX_VALUE)

        return 0
    }
}