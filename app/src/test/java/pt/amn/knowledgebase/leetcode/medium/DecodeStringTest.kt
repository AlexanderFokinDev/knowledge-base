package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class DecodeStringTest {

    @Test
    fun decodeStringTest1() {
        assertEquals("aaabcbc", DecodeString("3[a]2[bc]").getResult())
    }

    @Test
    fun decodeStringTest2() {
        assertEquals("accaccacc", DecodeString("3[a2[c]]").getResult())
    }

    @Test
    fun decodeStringTest3() {
        assertEquals("abcabccdcdcdef", DecodeString("2[abc]3[cd]ef").getResult())
    }

    @Test
    fun decodeStringTest4() {
        assertEquals("abcabcabcabcabcabcabcabcabcabcabccdcdcdef", DecodeString("11[abc]3[cd]ef").getResult())
    }

    @Test
    fun decodeStringTest5() {
        assertEquals("acbbcbbacbbcbbacbbcbb", DecodeString("3[a2[c2[b]]]").getResult())
    }

    @Test
    fun decodeStringTest6() {
        assertEquals("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef",
            DecodeString("3[z]2[2[y]pq4[2[jk]e1[f]]]ef").getResult())
    }

    @Test
    fun decodeStringTest7() {
        assertEquals("aaatbc", DecodeString("3[a]t1[bc]").getResult())
    }
}