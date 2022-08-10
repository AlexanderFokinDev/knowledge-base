package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 */
class FibonacciNumber(private val n: Int) : Solution<Int> {

    override fun getResult(): Int {

        return (fibonacci(n))
    }

    private fun fibonacci(number: Int) : Int {

        if (number <= 0) {
            return 0
        } else if (number == 1) {
            return 1
        }

        return fibonacci(number-1) + fibonacci(number-2)
    }
}