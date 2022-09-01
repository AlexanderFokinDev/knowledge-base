package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class NumberOfGoodPairsTest() {

    @Test
    fun numberOfGoodPairsTest1() {

        assertEquals(4, NumberOfGoodPairs(intArrayOf(1,2,3,1,1,3)).getResult())
    }

    @Test
    fun numberOfGoodPairsTest2() {

        assertEquals(6, NumberOfGoodPairs(intArrayOf(1,1,1,1)).getResult())
    }

    @Test
    fun numberOfGoodPairsTest3() {

        assertEquals(0, NumberOfGoodPairs(intArrayOf(1,2,3)).getResult())
    }
}