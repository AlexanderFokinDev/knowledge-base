package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.math.FibonacciNumber

class FibonacciNumberTest {

    @Test
    fun fibonacciNumberTest1() {
        assertEquals(1, FibonacciNumber(2).getResult())
    }

    @Test
    fun fibonacciNumberTest3() {
        assertEquals(2, FibonacciNumber(3).getResult())
    }

    @Test
    fun fibonacciNumberTest4() {
        assertEquals(3, FibonacciNumber(4).getResult())
    }
}