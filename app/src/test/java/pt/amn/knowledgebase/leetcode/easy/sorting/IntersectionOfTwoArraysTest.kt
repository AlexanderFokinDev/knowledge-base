package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class IntersectionOfTwoArraysTest {

    @Test
    fun intersectionOfTwoArraysTest1() {

        assertArrayEquals(
            intArrayOf(2),
            IntersectionOfTwoArrays(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).getResult()
        )
    }

    @Test
    fun intersectionOfTwoArraysTest2() {

        assertArrayEquals(
            intArrayOf(4, 9),
            IntersectionOfTwoArrays(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).getResult()
        )
    }
}