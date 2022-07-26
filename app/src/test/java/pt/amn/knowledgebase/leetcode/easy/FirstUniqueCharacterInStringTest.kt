package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class FirstUniqueCharacterInStringTest {

    @Test
    fun firstUniqueCharacterInStringTest1() {
        val expected = 0
        assertEquals(expected, FirstUniqueCharacterInString("leetcode").getResult())
    }

    @Test
    fun firstUniqueCharacterInStringTest2() {
        val expected = 2
        assertEquals(expected, FirstUniqueCharacterInString("loveleetcode").getResult())
    }

    @Test
    fun firstUniqueCharacterInStringTest3() {
        val expected = -1
        assertEquals(expected, FirstUniqueCharacterInString("aabb").getResult())
    }
}