package pt.amn.knowledgebase.leetcode.easy.stack

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.stack.ValidParentheses

class ValidParenthesesTest {

    @Test
    fun validParenthesesTest1() {
        assertTrue(ValidParentheses("()").getResult())
    }

    @Test
    fun validParenthesesTest2() {
        assertTrue(ValidParentheses("()[]{}").getResult())
    }

    @Test
    fun validParenthesesTest3() {
        assertFalse(ValidParentheses("(]").getResult())
    }

    @Test
    fun validParenthesesTest4() {
        assertTrue(ValidParentheses("").getResult())
    }

    @Test
    fun validParenthesesTest5() {
        assertFalse(ValidParentheses("()[{}").getResult())
    }

    @Test
    fun validParenthesesTest6() {
        assertTrue(ValidParentheses("([{}])").getResult())
    }

    @Test
    fun validParenthesesTest7() {
        assertFalse(ValidParentheses("(((((((((((").getResult())
    }

    @Test
    fun validParenthesesTest8() {
        assertTrue(ValidParentheses("(([]){})").getResult())
    }
}