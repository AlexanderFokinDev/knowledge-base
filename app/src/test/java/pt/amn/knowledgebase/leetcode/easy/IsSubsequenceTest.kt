package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class IsSubsequenceTest {

    @Test
    fun isSubsequenceTest1() {
        assertTrue(IsSubsequence("abc", "ahbgdc").getResult())
    }

    @Test
    fun isSubsequenceTest2() {
        assertFalse(IsSubsequence("axc", "ahbgdc").getResult())
    }
}