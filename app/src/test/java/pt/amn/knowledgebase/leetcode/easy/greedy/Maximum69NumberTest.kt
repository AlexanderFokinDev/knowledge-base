package pt.amn.knowledgebase.leetcode.easy.greedy

import org.junit.Assert.*
import org.junit.Test

class Maximum69NumberTest {

    @Test
    fun maximum69NumberTest1() {
        assertEquals(9969, Maximum69Number(9669).getResult())
    }

    @Test
    fun maximum69NumberTest2() {
        assertEquals(9999, Maximum69Number(9996).getResult())
    }

    @Test
    fun maximum69NumberTest3() {
        assertEquals(9999, Maximum69Number(9999).getResult())
    }

    @Test
    fun maximum69NumberTest4() {
        assertEquals(999, Maximum69Number(996).getResult())
    }
}