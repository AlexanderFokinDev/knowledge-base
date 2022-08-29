package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class DecompressRunLengthEncodedListTest {

    @Test
    fun decompressRunLengthEncodedListTest1() {

        assertArrayEquals(
            intArrayOf(2, 4, 4, 4),
            DecompressRunLengthEncodedList(intArrayOf(1, 2, 3, 4)).getResult()
        )
    }

    @Test
    fun decompressRunLengthEncodedListTest2() {

        assertArrayEquals(
            intArrayOf(1,3,3),
            DecompressRunLengthEncodedList(intArrayOf(1,1,2,3)).getResult()
        )
    }
}