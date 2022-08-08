package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class MinCostClimbingStairsTest {

    @Test
    fun minCostClimbingStairsTest1() {

        val cost = intArrayOf(10,15,20)
        assertEquals(15, MinCostClimbingStairs(cost).getResult())
    }

    @Test
    fun minCostClimbingStairsTest2() {

        val cost = intArrayOf(1,100,1,1,1,100,1,1,100,1)
        assertEquals(6, MinCostClimbingStairs(cost).getResult())
    }
}