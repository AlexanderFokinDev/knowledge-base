package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class ClimbingStairsTest {

    @Test
    fun ClimbingStairsTest2() {
        assertEquals(2, ClimbingStairs(2).getResult())
    }

    @Test
    fun ClimbingStairsTest3() {
        assertEquals(3, ClimbingStairs(3).getResult())
    }

    @Test
    fun ClimbingStairsTest4() {
        assertEquals(5, ClimbingStairs(4).getResult())
    }

    @Test
    fun ClimbingStairsTest5() {
        assertEquals(8, ClimbingStairs(5).getResult())
    }

    @Test
    fun ClimbingStairsTest6() {
        assertEquals(13, ClimbingStairs(6).getResult())
    }
}