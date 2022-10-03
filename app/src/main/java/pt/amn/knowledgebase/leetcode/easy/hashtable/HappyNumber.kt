package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/** Write an algorithm to determine if a number n is happy.
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
*/
class HappyNumber(val n: Int) : Solution<Boolean> {

    var count = 0

    override fun getResult(): Boolean {

        try {
            return countNumber(n) == 1
        } catch (e: StackOverflowError) {
            return false
        }


    }

    private fun countNumber(n: Int) : Int {
        count++
        if (count > 10000) return 0
        var number = n
        val mutableList = MutableList<Int>(0){0}
        while (number > 0) {
            mutableList.add(number % 10)
            number /= 10
        }

        var newNumber = 0
        for (i in mutableList.size-1 downTo 0) {
            newNumber += Math.pow(mutableList[i].toDouble(), 2.0).toInt()
        }

        if (newNumber == 1) {
            return 1
        } else {
            return countNumber(newNumber)
        }

    }
}