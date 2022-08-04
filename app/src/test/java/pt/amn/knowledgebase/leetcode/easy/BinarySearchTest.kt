package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class BinarySearchTest {

    @Test
    fun binarySearchTest1() {
        assertEquals(4, BinarySearch(intArrayOf(-1,0,3,5,9,12), 9).getResult())
    }

    @Test
    fun binarySearchTest2() {
        assertEquals(-1, BinarySearch(intArrayOf(-1,0,3,5,9,12), 2).getResult())
    }

    @Test
    fun binarySearchTest3() {
        assertEquals(0, BinarySearch(intArrayOf(2), 2).getResult())
    }

    @Test
    fun binarySearchTest4() {
        assertEquals(-1, BinarySearch(intArrayOf(2), 5).getResult())
    }

    @Test
    fun binarySearchTest5() {
        assertEquals(-1, BinarySearch(intArrayOf(5), -5).getResult())
    }

    @Test
    fun binarySearchTest6() {
        assertEquals(1, BinarySearch(intArrayOf(2,5), 5).getResult())
    }
}