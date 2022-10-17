package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.strings.LongestCommonPrefix

class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefixTest1() {
        val expected = "fl"
        val result = LongestCommonPrefix(arrayOf("flower","flow","flight")).getResult()
        assertEquals(expected, result)
    }

    @Test
    fun longestCommonPrefixTest2() {
        val expected = ""
        val result = LongestCommonPrefix(arrayOf("dog","racecar","car")).getResult()
        assertEquals(expected, result)
    }

    @Test
    fun longestCommonPrefixTest3() {
        val expected = "a"
        val result = LongestCommonPrefix(arrayOf("ab","a")).getResult()
        assertEquals(expected, result)
    }

}