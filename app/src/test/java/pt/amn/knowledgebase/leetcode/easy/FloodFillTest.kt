package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class FloodFillTest() {

    @Test
    fun floodFillTest1() {

        val expected = arrayOf(intArrayOf(2,2,2), intArrayOf(2,2,0), intArrayOf(2,0,1))
        val image = arrayOf(intArrayOf(1,1,1), intArrayOf(1,1,0), intArrayOf(1,0,1))
        assertArrayEquals(expected, FloodFill(image, 1, 1, 2).getResult())

    }

    @Test
    fun floodFillTest2() {

        val expected = arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0))
        val image = arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0))
        assertArrayEquals(expected, FloodFill(image, 0, 0, 0).getResult())

    }

    @Test
    fun floodFillTest3() {

        val expected = arrayOf(intArrayOf(2,2,2), intArrayOf(2,2,2))
        val image = arrayOf(intArrayOf(0,0,0), intArrayOf(0,0,0))
        assertArrayEquals(expected, FloodFill(image, 1, 0, 2).getResult())

    }

}