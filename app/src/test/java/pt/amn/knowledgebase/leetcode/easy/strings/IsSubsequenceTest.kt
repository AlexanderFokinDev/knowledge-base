package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.strings.IsSubsequence

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