package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class RingsAndRodsTest {

    @Test
    fun ringsAndRodsTest1() {
        assertEquals(1, RingsAndRods("B0B6G0R6R0R6G9").getResult())
    }

    @Test
    fun ringsAndRodsTest2() {
        assertEquals(1, RingsAndRods("B0R0G0R9R0B0G0").getResult())
    }

    @Test
    fun ringsAndRodsTest3() {
        assertEquals(0, RingsAndRods("G4").getResult())
    }

    @Test
    fun ringsAndRodsTest4() {
        assertEquals(1, RingsAndRods("B9R9G0R4G6R8R2R9G9").getResult())
    }
}