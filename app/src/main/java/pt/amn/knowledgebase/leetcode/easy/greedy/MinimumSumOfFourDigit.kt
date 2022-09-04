package pt.amn.knowledgebase.leetcode.easy.greedy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a positive integer num consisting of exactly four digits. Split num into
 * two new integers new1 and new2 by using the digits found in num. Leading zeros are
 * allowed in new1 and new2, and all the digits found in num must be used.
 *
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
 * Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 * Return the minimum possible sum of new1 and new2.
 */
class MinimumSumOfFourDigit(private val num: Int) : Solution<Int> {

    override fun getResult(): Int {

        val arrayNumbers = getArrayFromNumber(num)
        arrayNumbers.sort()

        // Two pairs of two-digit numbers will always less than 3-digit number
        return (arrayNumbers[0]*10 + arrayNumbers[2]) + (arrayNumbers[1]*10 + arrayNumbers[3])
    }

    private fun factorial(n: Int) : Int {

        if (n <= 1) return 1

        var result: Int = 1

        for (number in n downTo 1) {
            result *= number
        }

        return result
    }

    private fun Array<Array<Int>>.printArray() {

        for ((i, array) in this.withIndex()) {

            for (j in array.indices) {
                print("${array[j]} ")
            }
            println()
        }

    }

    private fun getArrayFromNumber(number: Int) : IntArray {

        val mutList = mutableListOf<Int>()
        var tempNum = number
        while (tempNum > 0) {
            mutList.add(tempNum % 10)
            tempNum /= 10
        }

        mutList.reverse()

        return mutList.toIntArray()
    }
}