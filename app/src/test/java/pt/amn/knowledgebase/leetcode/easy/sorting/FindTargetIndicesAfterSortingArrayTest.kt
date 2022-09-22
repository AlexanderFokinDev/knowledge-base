package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class FindTargetIndicesAfterSortingArrayTest {

    @Test
    fun findTargetIndicesAfterSortingArrayTest1() {

        assertArrayEquals(
            listOf(1, 2).toTypedArray(),
            FindTargetIndicesAfterSortingArray(intArrayOf(1, 2, 5, 2, 3), 2).getResult()
                .toTypedArray()
        )
    }

    @Test
    fun findTargetIndicesAfterSortingArrayTest2() {

        assertArrayEquals(
            listOf(3).toTypedArray(),
            FindTargetIndicesAfterSortingArray(intArrayOf(1, 2, 5, 2, 3), 3).getResult()
                .toTypedArray()
        )
    }

    @Test
    fun findTargetIndicesAfterSortingArrayTest3() {

        assertArrayEquals(
            listOf(4).toTypedArray(),
            FindTargetIndicesAfterSortingArray(intArrayOf(1, 2, 5, 2, 3), 5).getResult()
                .toTypedArray()
        )
    }

}