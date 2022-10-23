package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class FindCommonCharactersTest {

    @Test
    fun findCommonCharactersTest1() {

        assertArrayEquals(
            listOf("e", "l", "l").toTypedArray(),
            FindCommonCharacters(arrayOf("bella", "label", "roller")).getResult().toTypedArray()
        )
    }

    @Test
    fun findCommonCharactersTest2() {

        assertArrayEquals(
            listOf("c", "o").toTypedArray(),
            FindCommonCharacters(arrayOf("cool","lock","cook")).getResult().toTypedArray()
        )
    }
}