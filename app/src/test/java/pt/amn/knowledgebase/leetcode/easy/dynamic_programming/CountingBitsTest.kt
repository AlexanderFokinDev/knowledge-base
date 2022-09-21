package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import org.junit.Assert.*
import org.junit.Test

class CountingBitsTest {

    @Test
    fun countingBitsTest1() {

        assertArrayEquals(intArrayOf(0, 1, 1), CountingBits(2).getResult())
    }

    @Test
    fun countingBitsTest2() {

        assertArrayEquals(intArrayOf(0, 1, 1, 2, 1, 2), CountingBits(5).getResult())
    }
}