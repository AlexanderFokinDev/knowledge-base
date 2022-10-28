package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class FairCandySwapTest {

    @Test
    fun fairCandySwapTest1() {

        assertArrayEquals(intArrayOf(1, 2), FairCandySwap(intArrayOf(1,1), intArrayOf(2,2)).getResult())
    }

    @Test
    fun fairCandySwapTest2() {

        assertArrayEquals(intArrayOf(1, 2), FairCandySwap(intArrayOf(1,2), intArrayOf(2,3)).getResult())
    }

    @Test
    fun fairCandySwapTest3() {

        assertArrayEquals(intArrayOf(2,3), FairCandySwap(intArrayOf(2), intArrayOf(1,3)).getResult())
    }
}