package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class KeepMultiplyingFoundValuesByTwoTest {

    @Test
    fun keepMultiplyingFoundValuesByTwoTest1() {
        assertEquals(
            24, KeepMultiplyingFoundValuesByTwo(
                intArrayOf(5, 3, 6, 1, 12), 3
            ).getResult()
        )
    }

    @Test
    fun keepMultiplyingFoundValuesByTwoTest2() {
        assertEquals(
            4, KeepMultiplyingFoundValuesByTwo(
                intArrayOf(2, 7, 9), 4
            ).getResult()
        )
    }

    @Test
    fun keepMultiplyingFoundValuesByTwoTest3() {
        assertEquals(
            2, KeepMultiplyingFoundValuesByTwo(
                intArrayOf(1, 16, 13, 19, 12, 10), 2
            ).getResult()
        )
    }
}