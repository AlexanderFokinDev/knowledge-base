package pt.amn.knowledgebase.leetcode.easy.stack

import pt.amn.knowledgebase.leetcode.Solution
import java.util.*

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
class ValidParentheses(private val s: String) : Solution<Boolean> {

    override fun getResult(): Boolean {

        val stack = Stack<Char>()

        s.forEach { symbol ->
            when {
                !isClosedSymbol(symbol) -> stack.push(getPare(symbol))
                isClosedSymbol(symbol) && stack.isNotEmpty() && symbol == stack.peek() -> stack.pop()
                else -> return false
            }

        }

        return stack.isEmpty()
    }

    private fun getPare(openSymbol: Char) : Char =
        when (openSymbol) {
            '(' -> ')'
            '[' -> ']'
            '{' -> '}'
            ')' -> '('
            ']' -> '['
            '}' -> '{'
            else -> ' '
        }

    private fun isClosedSymbol(symbol: Char) : Boolean =
        listOf(')', ']', '}').contains(symbol)
}