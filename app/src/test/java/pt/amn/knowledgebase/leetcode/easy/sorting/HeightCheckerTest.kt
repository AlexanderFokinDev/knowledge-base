package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class HeightCheckerTest {

    @Test
    fun heightCheckerTest1() {

        assertEquals(3, HeightChecker(intArrayOf(1,1,4,2,1,3)).getResult())
    }

    @Test
    fun heightCheckerTest2() {

        assertEquals(5, HeightChecker(intArrayOf(5,1,2,3,4)).getResult())
    }

    @Test
    fun heightCheckerTest3() {

        assertEquals(0, HeightChecker(intArrayOf(1,2,3,4,5)).getResult())
    }
}