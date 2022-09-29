package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class MaximumNumberOfPairsInArrayTest {

    @Test
    fun maximumNumberOfPairsInArrayTest1() {

        assertArrayEquals(intArrayOf(3,1), MaximumNumberOfPairsInArray(intArrayOf(1,3,2,1,3,2,2)).getResult())
    }

    @Test
    fun maximumNumberOfPairsInArrayTest2() {

        assertArrayEquals(intArrayOf(1,0), MaximumNumberOfPairsInArray(intArrayOf(1,1)).getResult())
    }

    @Test
    fun maximumNumberOfPairsInArrayTest3() {

        assertArrayEquals(intArrayOf(0,1), MaximumNumberOfPairsInArray(intArrayOf(0)).getResult())
    }
}