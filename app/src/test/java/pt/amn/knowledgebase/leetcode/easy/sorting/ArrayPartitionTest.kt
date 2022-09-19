package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class ArrayPartitionTest {

    @Test
    fun arrayPartitionTest1() {

        assertEquals(4, ArrayPartition(intArrayOf(1, 4, 3, 2)).getResult())
    }

    @Test
    fun arrayPartitionTest2() {

        assertEquals(9, ArrayPartition(intArrayOf(6, 2, 6, 5, 1, 2)).getResult())
    }
}