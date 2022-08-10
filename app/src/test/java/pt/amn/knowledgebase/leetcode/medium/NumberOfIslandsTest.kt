package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class NumberOfIslandsTest {

    @Test
    fun numberOfIslandsTest1() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1','1','1','1','0'),
            charArrayOf('1','1','0','1','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','0','0','0')
        )
        assertEquals(1, NumberOfIslands(grid).getResult())
    }

    @Test
    fun numberOfIslandsTest2() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1','1','0','0','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','1','0','0'),
            charArrayOf('0','0','0','1','1')
        )
        assertEquals(3, NumberOfIslands(grid).getResult())
    }

    @Test
    fun numberOfIslandsTest3() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('0','0','0','0','0'),
            charArrayOf('0','0','0','0','0'),
            charArrayOf('0','0','0','0','0'),
            charArrayOf('0','0','0','0','0')
        )
        assertEquals(0, NumberOfIslands(grid).getResult())
    }

    @Test
    fun numberOfIslandsTest4() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('1','1','1','1','1'),
            charArrayOf('1','1','1','1','1'),
            charArrayOf('1','1','1','1','1'),
            charArrayOf('1','1','1','1','1')
        )
        assertEquals(1, NumberOfIslands(grid).getResult())
    }

    @Test
    fun numberOfIslandsTest5() {
        val grid: Array<CharArray> = arrayOf(
            charArrayOf('0','1','0'),
            charArrayOf('1','0','1'),
            charArrayOf('0','1','0')
        )
        assertEquals(4, NumberOfIslands(grid).getResult())
    }
}