package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class GreatestEnglishLetterInUpperAndLowerCaseTest {

    @Test
    fun greatestEnglishLetterInUpperAndLowerCaseTest1() {
        assertEquals("E", GreatestEnglishLetterInUpperAndLowerCase("lEeTcOdE").getResult())
    }

    @Test
    fun greatestEnglishLetterInUpperAndLowerCaseTest2() {
        assertEquals("R", GreatestEnglishLetterInUpperAndLowerCase("arRAzFif").getResult())
    }

    @Test
    fun greatestEnglishLetterInUpperAndLowerCaseTest3() {
        assertEquals("", GreatestEnglishLetterInUpperAndLowerCase("AbCdEfGhIjK").getResult())
    }
}