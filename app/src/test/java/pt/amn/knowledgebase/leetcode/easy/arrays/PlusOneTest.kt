package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.PlusOne

class PlusOneTest {

    @Test
    fun plusOneTest123() {
        val expected = intArrayOf(1,2,4)
        val input = intArrayOf(1,2,3)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest4321() {
        val expected = intArrayOf(4,3,2,2)
        val input = intArrayOf(4,3,2,1)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest9() {
        val expected = intArrayOf(1,0)
        val input = intArrayOf(9)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest99() {
        val expected = intArrayOf(1,0,0)
        val input = intArrayOf(9,9)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest999() {
        val expected = intArrayOf(1,0,0,0)
        val input = intArrayOf(9,9,9)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest8999() {
        val expected = intArrayOf(9,0,0,0)
        val input = intArrayOf(8,9,9,9)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }

    @Test
    fun plusOneTest9876543210() {
        val expected = intArrayOf(9,8,7,6,5,4,3,2,1,1)
        val input = intArrayOf(9,8,7,6,5,4,3,2,1,0)
        assertArrayEquals(expected, PlusOne(input).getResult())
    }
}