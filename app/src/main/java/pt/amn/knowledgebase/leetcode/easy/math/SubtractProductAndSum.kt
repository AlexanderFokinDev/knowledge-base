package pt.amn.knowledgebase.leetcode.easy.math

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer number n, return the difference between the product
 * of its digits and the sum of its digits.
 */
class SubtractProductAndSum(private val n: Int): Solution<Int> {

    override fun getResult(): Int {

        var sum = 0
        var product = 1

        var num = n
        while (num > 0) {
            val tile = num % 10
            sum += tile
            product *= tile
            num /= 10
        }

        return product - sum
    }
}