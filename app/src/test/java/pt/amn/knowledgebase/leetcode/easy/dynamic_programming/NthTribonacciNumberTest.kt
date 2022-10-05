package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import org.junit.Assert.*
import org.junit.Test

class NthTribonacciNumberTest {

    @Test
    fun TribonacciNumberTest1() {
        assertEquals(4, NthTribonacciNumber(4).getResult())
    }

    @Test
    fun TribonacciNumberTest2() {
        assertEquals(1389537, NthTribonacciNumber(25).getResult())
    }
}