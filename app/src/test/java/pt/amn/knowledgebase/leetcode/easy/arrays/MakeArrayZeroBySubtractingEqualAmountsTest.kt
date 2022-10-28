package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class MakeArrayZeroBySubtractingEqualAmountsTest {

    @Test
    fun makeArrayZeroBySubtractingEqualAmountsTest1() {

        assertEquals(
            3,
            MakeArrayZeroBySubtractingEqualAmounts(intArrayOf(1, 5, 0, 3, 5)).getResult()
        )
    }

    @Test
    fun makeArrayZeroBySubtractingEqualAmountsTest2() {

        assertEquals(0, MakeArrayZeroBySubtractingEqualAmounts(intArrayOf(0)).getResult())
    }
}