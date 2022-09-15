package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class MinimumNumberOfMovesToSeatEveryoneTest {

    @Test
    fun minimumNumberOfMovesToSeatEveryoneTest1() {

        assertEquals(
            4,
            MinimumNumberOfMovesToSeatEveryone(intArrayOf(3, 1, 5), intArrayOf(2, 7, 4)).getResult()
        )
    }

    @Test
    fun minimumNumberOfMovesToSeatEveryoneTest2() {

        assertEquals(
            7,
            MinimumNumberOfMovesToSeatEveryone(
                intArrayOf(4, 1, 5, 9),
                intArrayOf(1, 3, 2, 6)
            ).getResult()
        )
    }

    @Test
    fun minimumNumberOfMovesToSeatEveryoneTest3() {

        assertEquals(
            4,
            MinimumNumberOfMovesToSeatEveryone(
                intArrayOf(2, 2, 6, 6),
                intArrayOf(1, 3, 2, 6)
            ).getResult()
        )
    }
}