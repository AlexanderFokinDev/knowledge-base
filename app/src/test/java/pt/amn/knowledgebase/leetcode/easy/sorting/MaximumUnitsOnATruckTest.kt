package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class MaximumUnitsOnATruckTest {

    @Test
    fun maximumUnitsOnATruckTest1() {
        assertEquals(
            8, MaximumUnitsOnATruck(
                arrayOf(
                    intArrayOf(1, 3),
                    intArrayOf(2, 2),
                    intArrayOf(3, 1)
                ), 4
            ).getResult()
        )
    }

    @Test
    fun maximumUnitsOnATruckTest2() {
        assertEquals(
            91, MaximumUnitsOnATruck(
                arrayOf(
                    intArrayOf(5, 10),
                    intArrayOf(2, 5),
                    intArrayOf(4, 7),
                    intArrayOf(3, 9)
                ), 10
            ).getResult()
        )
    }
}