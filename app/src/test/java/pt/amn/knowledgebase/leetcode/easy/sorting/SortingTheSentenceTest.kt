package pt.amn.knowledgebase.leetcode.easy.sorting

import org.junit.Assert.*
import org.junit.Test

class SortingTheSentenceTest {

    @Test
    fun sortingTheSentenceTest1() {

        assertEquals("This is a sentence",
            SortingTheSentence("is2 sentence4 This1 a3").getResult())
    }

    @Test
    fun sortingTheSentenceTest2() {

        assertEquals("Me Myself and I",
            SortingTheSentence("Myself2 Me1 I4 and3").getResult())
    }
}