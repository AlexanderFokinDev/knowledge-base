package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test

class NumberOfStepsToReduceNumberToZeroTest {

    @Test
    fun numberOfStepsToReduceNumberToZeroTest1() {
        assertEquals(6, NumberOfStepsToReduceNumberToZero(14).getResult())
    }

    @Test
    fun numberOfStepsToReduceNumberToZeroTest2() {
        assertEquals(4, NumberOfStepsToReduceNumberToZero(8).getResult())
    }

    @Test
    fun numberOfStepsToReduceNumberToZeroTest3() {
        assertEquals(12, NumberOfStepsToReduceNumberToZero(123).getResult())
    }

}