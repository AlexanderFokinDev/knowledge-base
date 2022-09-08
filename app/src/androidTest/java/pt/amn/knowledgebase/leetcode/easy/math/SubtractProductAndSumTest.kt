package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test

class SubtractProductAndSumTest {

    @Test
    fun subtractProductAndSumTest1() {
        assertEquals(15, SubtractProductAndSum(234).getResult())
    }

    @Test
    fun subtractProductAndSumTest2() {
        assertEquals(21, SubtractProductAndSum(4421).getResult())
    }
}