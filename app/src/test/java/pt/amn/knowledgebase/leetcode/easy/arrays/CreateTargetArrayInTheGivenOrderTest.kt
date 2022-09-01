package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class CreateTargetArrayInTheGivenOrderTest {

    @Test
    fun createTargetArrayInTheGivenOrderTest1() {

        assertArrayEquals(
            intArrayOf(0, 4, 1, 3, 2),
            CreateTargetArrayInTheGivenOrder(
                intArrayOf(0, 1, 2, 3, 4),
                intArrayOf(0, 1, 2, 2, 1)
            ).getResult()
        )
    }

    @Test
    fun createTargetArrayInTheGivenOrderTest2() {

        assertArrayEquals(
            intArrayOf(0,1,2,3,4),
            CreateTargetArrayInTheGivenOrder(
                intArrayOf(1,2,3,4,0),
                intArrayOf(0,1,2,3,0)
            ).getResult()
        )
    }

    @Test
    fun createTargetArrayInTheGivenOrderTest3() {

        assertArrayEquals(
            intArrayOf(1),
            CreateTargetArrayInTheGivenOrder(
                intArrayOf(1),
                intArrayOf(0)
            ).getResult()
        )
    }
}