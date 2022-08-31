package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class DecodeXORedArrayTest {

    @Test
    fun decodeXORedArrayTest1() {
        assertArrayEquals(
            intArrayOf(1, 0, 2, 1),
            DecodeXORedArray(intArrayOf(1, 2, 3), 1).getResult()
        )
    }

    @Test
    fun decodeXORedArrayTest2() {
        assertArrayEquals(
            intArrayOf(4,2,0,7,4),
            DecodeXORedArray(intArrayOf(6,2,7,3), 4).getResult()
        )
    }
}