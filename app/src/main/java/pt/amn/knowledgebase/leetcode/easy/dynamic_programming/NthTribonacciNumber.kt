package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import pt.amn.knowledgebase.leetcode.Solution

/**
 * The Tribonacci sequence Tn is defined as follows:
 *
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 *
 * Given n, return the value of Tn.
 */
class NthTribonacciNumber(private val n: Int) : Solution<Int> {

    override fun getResult(): Int {

        when (n) {
            0 -> return 0
            1 -> return 1
            2 -> return 1
        }

        val array = IntArray(n) {0}
        array[1] = 1
        array[2] = 1

        for (i in 3 until n) {
            array[i] = array[i-3] + array[i-2] + array[i-1]
        }

        return array[n-3] + array[n-2] + array[n-1]
    }
}