package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class CheckIfTwoStringArraysAreEquivalentTest {

    @Test
    fun checkIfTwoStringArraysAreEquivalentTest1() {
        assertEquals(
            CheckIfTwoStringArraysAreEquivalent(
                arrayOf("ab", "c"),
                arrayOf("a", "bc")
            ).getResult(), true
        )
    }

    @Test
    fun checkIfTwoStringArraysAreEquivalentTest2() {
        assertEquals(
            CheckIfTwoStringArraysAreEquivalent(
                arrayOf("a", "cb"),
                arrayOf("ab", "c")
            ).getResult(), false
        )
    }

    @Test
    fun checkIfTwoStringArraysAreEquivalentTest3() {
        assertEquals(
            CheckIfTwoStringArraysAreEquivalent(
                arrayOf("abc", "d", "defg"),
                arrayOf("abcddefg")
            ).getResult(), true
        )
    }
}