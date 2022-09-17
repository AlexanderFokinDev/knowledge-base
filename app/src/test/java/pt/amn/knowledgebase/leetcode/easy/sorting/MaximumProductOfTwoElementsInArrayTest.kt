package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class MaximumProductOfTwoElementsInArrayTest {

    @Test
    fun maximumProductOfTwoElementsInArrayTest1() {

        assertEquals(
            12,
            MaximumProductOfTwoElementsInArray(intArrayOf(3, 4, 5, 2)).getResult()
        )
    }

    @Test
    fun maximumProductOfTwoElementsInArrayTest2() {

        assertEquals(
            16,
            MaximumProductOfTwoElementsInArray(intArrayOf(1, 5, 4, 5)).getResult()
        )
    }

    @Test
    fun maximumProductOfTwoElementsInArrayTest3() {

        assertEquals(
            12,
            MaximumProductOfTwoElementsInArray(intArrayOf(3, 7)).getResult()
        )
    }
}