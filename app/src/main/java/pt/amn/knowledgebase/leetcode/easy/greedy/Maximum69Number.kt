package pt.amn.knowledgebase.leetcode.easy.greedy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given a positive integer num consisting only of digits 6 and 9.
 *
 * Return the maximum number you can get by changing at most one digit
 * (6 becomes 9, and 9 becomes 6).
 */
class Maximum69Number(private val num: Int) : Solution<Int> {

    override fun getResult(): Int {

        var countOfDigits = 0
        var divider = 1

        for (i in 1..4) {

            if (num % divider == num) {
                break
            }
            countOfDigits += 1
            divider *= 10
        }
        divider /= 10

        val array = IntArray(countOfDigits) {0}
        var changeDone = false

        var sum = 0
        for (i in 0 until countOfDigits) {
            array[i] = (num-sum) / divider
            sum += array[i]*divider
            divider /= 10
            if(array[i] == 6 && !changeDone) {
                changeDone = true
                array[i] = 9
            }
        }

        var newNumber = 0

        divider = 1
        for (i in array.size-1 downTo 0) {
            newNumber += array[i] * divider
            divider *= 10
        }

        return newNumber

    }
}