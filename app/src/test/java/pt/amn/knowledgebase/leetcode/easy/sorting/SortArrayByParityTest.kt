package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class SortArrayByParityTest {

    @Test
    fun sortArrayByParityTest1() {

        assertArrayEquals(
            intArrayOf(2, 4, 1, 3),
            SortArrayByParity(intArrayOf(3, 1, 2, 4)).getResult()
        )
    }

    @Test
    fun sortArrayByParityTest2() {

        assertArrayEquals(intArrayOf(0), SortArrayByParity(intArrayOf(0)).getResult())
    }
}