package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

class PalindromeNumber(private val x: Int) : Solution<Boolean> {

    override fun getResult(): Boolean {
        var num = x
        var reversed = 0
        while (num != 0) {
            val digit = num % 10
            reversed = reversed * 10 + digit
            num /= 10
        }
        if (x < 0) return false
        else return x == reversed
        /*val xStr = x.toString()
        return xStr == xStr.reversed()*/
    }

}