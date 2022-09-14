package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class CountTheNumberOfConsistentStringsTest {

    @Test
    fun countTheNumberOfConsistentStringsTest1() {

        assertEquals(
            2,
            CountTheNumberOfConsistentStrings(
                "ab",
                arrayOf("ad", "bd", "aaab", "baa", "badab")
            ).getResult()
        )
    }

    @Test
    fun countTheNumberOfConsistentStringsTest2() {

        assertEquals(
            7,
            CountTheNumberOfConsistentStrings(
                "abc",
                arrayOf("a","b","c","ab","ac","bc","abc")
            ).getResult()
        )
    }

    @Test
    fun countTheNumberOfConsistentStringsTest3() {

        assertEquals(
            4,
            CountTheNumberOfConsistentStrings(
                "cad",
                arrayOf("cc","acd","b","ba","bac","bad","ac","d")
            ).getResult()
        )
    }
}