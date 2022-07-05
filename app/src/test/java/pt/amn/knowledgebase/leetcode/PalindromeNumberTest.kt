package pt.amn.knowledgebase.leetcode

import org.junit.Assert.*
import org.junit.Test

class PalindromeNumberTest {

    @Test
    fun palindromeNumber() {
        assertTrue(PalindromeNumber(0).getResult())
        assertTrue(PalindromeNumber(1).getResult())
        assertTrue(PalindromeNumber(9).getResult())
        assertTrue(PalindromeNumber(121).getResult())
        assertTrue(PalindromeNumber(3223).getResult())
        assertTrue(PalindromeNumber(510015).getResult())
        assertFalse(PalindromeNumber(10).getResult())
        assertFalse(PalindromeNumber(-1).getResult())
        assertFalse(PalindromeNumber(5125).getResult())
    }
}