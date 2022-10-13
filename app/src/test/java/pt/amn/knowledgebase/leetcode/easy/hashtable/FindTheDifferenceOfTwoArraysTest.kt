package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class FindTheDifferenceOfTwoArraysTest {

    @Test
    fun findTheDifferenceOfTwoArraysTest1() {

        val expected = listOf(listOf(1, 3), listOf(4, 6))

        assertArrayEquals(expected.toTypedArray(),
            FindTheDifferenceOfTwoArrays(intArrayOf(1, 2, 3), intArrayOf(2, 4, 6)).getResult()
                .toTypedArray()
        )
    }

    @Test
    fun findTheDifferenceOfTwoArraysTest2() {

        val expected = listOf(listOf(3), listOf())

        assertArrayEquals(expected.toTypedArray(),
            FindTheDifferenceOfTwoArrays(intArrayOf(1,2,3,3), intArrayOf(1,1,2,2)).getResult()
                .toTypedArray()
        )
    }
}