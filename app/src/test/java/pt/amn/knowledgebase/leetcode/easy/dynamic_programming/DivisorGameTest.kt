package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import org.junit.Assert.*
import org.junit.Test

class DivisorGameTest {

    @Test
    fun divisorGameTest1() {
        assertEquals(true, DivisorGame(2).getResult())
    }

    @Test
    fun divisorGameTest2() {
        assertEquals(false, DivisorGame(3).getResult())
    }

    @Test
    fun divisorGameTest3() {
        assertEquals(true, DivisorGame(324).getResult())
    }

    @Test
    fun divisorGameTest4() {
        assertEquals(false, DivisorGame(325).getResult())
    }
}