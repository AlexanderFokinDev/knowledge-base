package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class HappyNumberTest {

    @Test
    fun happyNumber19() {
        assertEquals(true, HappyNumber(19).getResult())
    }

    @Test
    fun happyNumber2() {
        assertEquals(false, HappyNumber(2).getResult())
    }

    @Test
    fun happyNumber1() {
        assertEquals(true, HappyNumber(1).getResult())
    }
}