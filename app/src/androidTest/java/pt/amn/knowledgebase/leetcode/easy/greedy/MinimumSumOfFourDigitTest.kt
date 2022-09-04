package pt.amn.knowledgebase.leetcode.easy.greedy

import org.junit.Assert.*
import org.junit.Test

class MinimumSumOfFourDigitTest {

    @Test
    fun minimumSumOfFourDigitTest1() {
        assertEquals(52, MinimumSumOfFourDigit(2932).getResult())
    }

    @Test
    fun minimumSumOfFourDigitTest2() {
        assertEquals(13, MinimumSumOfFourDigit(4009).getResult())
    }
}