package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class UniqueMorseCodeWordsTest {

    @Test
    fun uniqueMorseCodeWordsTest1() {

        assertEquals(2, UniqueMorseCodeWords(arrayOf("gin","zen","gig","msg")).getResult())
    }

    @Test
    fun uniqueMorseCodeWordsTest2() {

        assertEquals(1, UniqueMorseCodeWords(arrayOf("a")).getResult())
    }
}