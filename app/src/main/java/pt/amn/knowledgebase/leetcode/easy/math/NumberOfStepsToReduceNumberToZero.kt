package pt.amn.knowledgebase.leetcode.easy.math

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer num, return the number of steps to reduce it to zero.
 *
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 */
class NumberOfStepsToReduceNumberToZero(private val num: Int) : Solution<Int> {

    override fun getResult(): Int {

        var reduceNum = num
        var counter = 0
        while (reduceNum > 0) {
            if (reduceNum % 2 == 0) {
                reduceNum /= 2
            } else {
                reduceNum -= 1
            }
            counter++
        }

        return counter
    }
}