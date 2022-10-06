package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class SumOfUniqueElementsTest {

    @Test
    fun sumOfUniqueElementsTest1() {
        assertEquals(4, SumOfUniqueElements(intArrayOf(1, 2, 3, 2)).getResult())
    }

    @Test
    fun sumOfUniqueElementsTest2() {
        assertEquals(0, SumOfUniqueElements(intArrayOf(1, 1, 1, 1, 1)).getResult())
    }

    @Test
    fun sumOfUniqueElementsTest3() {
        assertEquals(15, SumOfUniqueElements(intArrayOf(1, 2, 3, 4, 5)).getResult())
    }
}