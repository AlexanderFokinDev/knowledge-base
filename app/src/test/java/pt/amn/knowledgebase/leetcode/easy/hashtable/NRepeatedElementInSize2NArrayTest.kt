package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class NRepeatedElementInSize2NArrayTest {

    @Test
    fun nRepeatedElementInSize2NArrayTest1() {
        assertEquals(3, NRepeatedElementInSize2NArray(intArrayOf(1, 2, 3, 3)).getResult())
    }

    @Test
    fun nRepeatedElementInSize2NArrayTest2() {
        assertEquals(
            2,
            NRepeatedElementInSize2NArray(intArrayOf(2, 1, 2, 5, 3, 2)).getResult())
    }

    @Test
    fun nRepeatedElementInSize2NArrayTest3() {
        assertEquals(
            5,
            NRepeatedElementInSize2NArray(intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)).getResult()
        )
    }
}