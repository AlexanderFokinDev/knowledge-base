package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class DecodeTheMessageTest {

    @Test
    fun decodeTheMessageTest1() {

        assertEquals(
            "this is a secret",
            DecodeTheMessage(
                "the quick brown fox jumps over the lazy dog",
                "vkbs bs t suepuv"
            ).getResult()
        )
    }

    @Test
    fun decodeTheMessageTest2() {

        assertEquals(
            "the five boxing wizards jump quickly",
            DecodeTheMessage(
                "eljuxhpwnyrdgtqkviszcfmabo",
                "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
            ).getResult()
        )
    }
}