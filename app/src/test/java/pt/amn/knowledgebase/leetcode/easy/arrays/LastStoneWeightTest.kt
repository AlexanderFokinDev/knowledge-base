package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.LastStoneWeight

class LastStoneWeightTest {

    @Test
    fun lastStoneWeightTest1() {
        assertEquals(1, LastStoneWeight(intArrayOf(2,7,4,1,8,1)).getResult())
    }

    @Test
    fun lastStoneWeightTest2() {
        assertEquals(1, LastStoneWeight(intArrayOf(1)).getResult())
    }

    @Test
    fun lastStoneWeightTest3() {
        assertEquals(0, LastStoneWeight(intArrayOf(2,2)).getResult())
    }
}