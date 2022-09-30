package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class FirstLetterToAppearTwiceTest {

    @Test
    fun firstLetterToAppearTwiceTest1() {

        assertEquals('c', FirstLetterToAppearTwice("abccbaacz").getResult())
    }

    @Test
    fun firstLetterToAppearTwiceTest2() {

        assertEquals('d', FirstLetterToAppearTwice("abcdd").getResult())
    }
}