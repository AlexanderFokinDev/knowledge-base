package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.hashtable.IsomorphicStrings

class IsomorphicStringsTest {

    @Test
    fun isomorphicStringsTest1() {
        assertTrue(IsomorphicStrings("egg", "add").getResult())
    }

    @Test
    fun isomorphicStringsTest2() {
        assertFalse(IsomorphicStrings("foo", "bar").getResult())
    }

    @Test
    fun isomorphicStringsTest3() {
        assertTrue(IsomorphicStrings("paper", "title").getResult())
    }

    @Test
    fun isomorphicStringsTes4() {
        assertFalse(IsomorphicStrings("badc", "baba").getResult())
    }
}