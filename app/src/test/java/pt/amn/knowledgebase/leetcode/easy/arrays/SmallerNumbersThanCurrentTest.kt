package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class SmallerNumbersThanCurrentTest {

    @Test
    fun smallerNumbersThanCurrentTest1() {
        assertArrayEquals(
            intArrayOf(4, 0, 1, 1, 3),
            SmallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).getResult()
        )
    }

    @Test
    fun smallerNumbersThanCurrentTest2() {
        assertArrayEquals(
            intArrayOf(2,1,0,3),
            SmallerNumbersThanCurrent(intArrayOf(6,5,4,8)).getResult()
        )
    }

    @Test
    fun smallerNumbersThanCurrentTest3() {
        assertArrayEquals(
            intArrayOf(0,0,0,0),
            SmallerNumbersThanCurrent(intArrayOf(7,7,7,7)).getResult()
        )
    }
}