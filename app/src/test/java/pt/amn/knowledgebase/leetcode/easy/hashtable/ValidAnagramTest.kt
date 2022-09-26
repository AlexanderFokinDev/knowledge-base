package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.hashtable.ValidAnagram

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