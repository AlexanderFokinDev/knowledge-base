package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class MaximumProductDifferenceBetweenTwoPairsTest {

    @Test
    fun maximumProductDifferenceBetweenTwoPairsTest1() {

        assertEquals(
            34,
            MaximumProductDifferenceBetweenTwoPairs(intArrayOf(5, 6, 2, 7, 4)).getResult()
        )
    }

    @Test
    fun maximumProductDifferenceBetweenTwoPairsTest2() {

        assertEquals(
            64,
            MaximumProductDifferenceBetweenTwoPairs(intArrayOf(4, 2, 5, 9, 7, 4, 8)).getResult()
        )
    }
}