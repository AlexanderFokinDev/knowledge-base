package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class RomanToIntegerTest {

    @Test
    fun `convert III`() {
        assertEquals(3, RomanToInteger("III").getResult())
    }

    @Test
    fun `convert LVIII`() {
        assertEquals(58, RomanToInteger("LVIII").getResult())
    }

    @Test
    fun `convert MCMXCIV`() {
        assertEquals(1994, RomanToInteger("MCMXCIV").getResult())
    }

    @Test
    fun `convert IV`() {
        assertEquals(4, RomanToInteger("IV").getResult())
    }

    @Test
    fun `convert IX`() {
        assertEquals(9, RomanToInteger("IX").getResult())
    }
}