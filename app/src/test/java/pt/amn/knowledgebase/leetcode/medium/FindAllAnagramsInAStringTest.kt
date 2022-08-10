package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class FindAllAnagramsInAStringTest {

    @Test
    fun findAllAnagramsInAStringTest1() {

        assertArrayEquals(listOf(0,6).toTypedArray()
            , FindAllAnagramsInAString("cbaebabacd", "abc").getResult().toTypedArray())
    }

    @Test
    fun findAllAnagramsInAStringTest2() {

        assertArrayEquals(listOf(0,1,2).toTypedArray()
            , FindAllAnagramsInAString("abab", "ab").getResult().toTypedArray())
    }
}