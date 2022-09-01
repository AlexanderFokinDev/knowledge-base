package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    fun maximumNumberOfWordsFoundInSentencesTest1() {

        assertEquals(
            6,
            MaximumNumberOfWordsFoundInSentences(
                arrayOf(
                    "alice and bob love leetcode",
                    "i think so too",
                    "this is great thanks very much"
                )
            ).getResult()
        )
    }

    @Test
    fun maximumNumberOfWordsFoundInSentencesTest2() {

        assertEquals(
            3,
            MaximumNumberOfWordsFoundInSentences(
                arrayOf(
                    "please wait", "continue to fight", "continue to win"
                )
            ).getResult()
        )
    }
}