package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class ReverseStringTest {

    @Test
    fun reverseString() {
        val input = charArrayOf('t', 'e', 's', 't', 'i', 'n', 'g')
        val expected = charArrayOf('g', 'n', 'i', 't', 's', 'e', 't')
        val solver = ReverseString(input)
        assertArrayEquals(expected, solver.getResult())
    }
}