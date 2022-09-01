package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test

class JewelsAndStonesTest {

    @Test
    fun jewelsAndStonesTest1() {
        assertEquals(3, JewelsAndStones("aA", "aAAbbbb").getResult())
    }

    @Test
    fun jewelsAndStonesTest2() {
        assertEquals(0, JewelsAndStones("z", "ZZ").getResult())
    }
}