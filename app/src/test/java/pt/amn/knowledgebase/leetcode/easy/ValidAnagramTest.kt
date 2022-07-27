package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class ValidAnagramTest {

    @Test
    fun validAnagramTest1() {
        assertEquals(
            true, ValidAnagram("anagram", "nagaram").getResult()
        )
    }

    @Test
    fun validAnagramTest2() {
        assertEquals(
            false, ValidAnagram("rat", "car").getResult()
        )
    }
}