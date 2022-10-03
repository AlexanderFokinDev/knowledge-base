package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test

class SmallestEvenMultipleTest {

    @Test
    fun smallestEvenMultipleTest1() {
        assertEquals(10, SmallestEvenMultiple(5).getResult())
    }

    @Test
    fun smallestEvenMultipleTest2() {
        assertEquals(6, SmallestEvenMultiple(6).getResult())
    }
}