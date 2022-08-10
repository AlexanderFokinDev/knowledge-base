package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class BullsAndCowsTest {

    @Test
    fun bullsAndCowsTest1() {
        assertEquals("1A3B", BullsAndCows("1807", "7810").getResult())
    }

    @Test
    fun bullsAndCowsTest2() {
        assertEquals("1A1B", BullsAndCows("1123", "0111").getResult())
    }
}