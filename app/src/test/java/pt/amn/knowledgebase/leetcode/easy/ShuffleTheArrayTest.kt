package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class ShuffleTheArrayTest {

    @Test
    fun shuffleTheArrayTest1() {
        assertArrayEquals(
            intArrayOf(2, 3, 5, 4, 1, 7),
            ShuffleTheArray(intArrayOf(2, 5, 1, 3, 4, 7), 3).getResult()
        )
    }

    @Test
    fun shuffleTheArrayTest2() {
        assertArrayEquals(
            intArrayOf(1,4,2,3,3,2,4,1),
            ShuffleTheArray(intArrayOf(1,2,3,4,4,3,2,1) , 4).getResult()
        )
    }

    @Test
    fun shuffleTheArrayTest3() {
        assertArrayEquals(
            intArrayOf(1,2,1,2),
            ShuffleTheArray(intArrayOf(1,1,2,2), 2).getResult()
        )
    }
}