package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
class ClimbingStairs(private val n: Int) : Solution<Int> {

    override fun getResult(): Int {

        if (n <= 2) return n

        var temp = 0
        var curNum = 1
        var prevNum = 1
        for (num in n-2 downTo 0) {
            temp = curNum
            curNum = curNum + prevNum
            prevNum = temp
        }

        return curNum
    }

    /* Brute force way

    var sumVariants = 0

    override fun getResult(): Int {

        doStep(0)

        return sumVariants
    }

    private fun doStep(start: Int) {

        if (start == n) {
            sumVariants++
            return
        } else if (start > n) {
            return
        }

        doStep(start + 1)
        doStep(start + 2)
    }*/

}