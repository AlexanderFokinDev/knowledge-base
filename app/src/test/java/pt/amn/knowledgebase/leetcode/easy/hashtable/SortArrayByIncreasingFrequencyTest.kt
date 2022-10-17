package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class SortArrayByIncreasingFrequencyTest {

    @Test
    fun sortArrayByIncreasingFrequencyTest1() {

        assertArrayEquals(
            intArrayOf(3, 1, 1, 2, 2, 2),
            SortArrayByIncreasingFrequency(intArrayOf(1, 1, 2, 2, 2, 3)).getResult()
        )
    }

    @Test
    fun sortArrayByIncreasingFrequencyTest2() {

        assertArrayEquals(
            intArrayOf(1, 3, 3, 2, 2),
            SortArrayByIncreasingFrequency(intArrayOf(2, 3, 1, 3, 2)).getResult()
        )
    }

    @Test
    fun sortArrayByIncreasingFrequencyTest3() {

        assertArrayEquals(
            intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1),
            SortArrayByIncreasingFrequency(intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1)).getResult()
        )
    }
}