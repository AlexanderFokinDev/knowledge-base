package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
    Input: n = 5
    Output: ["1","2","Fizz","4","Buzz"]
 */
class FizzBuzz(val n: Int) : Solution<Array<String>> {

    override fun getResult(): Array<String> {
        val result = Array<String>(n) { "" }
        for(i in 1..n) {

            when {
                (i%3 == 0 && i%5 == 0) -> result[i-1] = "FizzBuzz"
                i%3 == 0 -> result[i-1] = "Fizz"
                i%5 == 0 -> result[i-1] = "Buzz"
                else -> result[i-1] = (i).toString()
            }
        }

        return result
    }
}