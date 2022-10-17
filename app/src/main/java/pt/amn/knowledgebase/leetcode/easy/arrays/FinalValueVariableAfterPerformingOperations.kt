package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * There is a programming language with only four operations and one variable X:
 *
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations, return the final value
 * of X after performing all the operations.
 */
class FinalValueVariableAfterPerformingOperations(private val operations: Array<String>) :
    Solution<Int> {

    override fun getResult(): Int {

        var result = 0

        for (num in operations) {
            result += when (num.uppercase()) {
                "X++" -> 1
                "++X" -> 1
                "X--" -> -1
                "--X" -> -1
                else -> 0
            }
        }

        return result
    }
}