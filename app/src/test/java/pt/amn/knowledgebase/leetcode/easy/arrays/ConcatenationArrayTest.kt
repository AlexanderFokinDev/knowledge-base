package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.ConcatenationArray

class ConcatenationArrayTest {

    @Test
    fun concatenationArray() {
        val nums = intArrayOf(1, 3, 2, 1)
        val target = intArrayOf(1, 3, 2, 1, 1, 3, 2, 1)
        val solver = ConcatenationArray(nums)
        assertArrayEquals(target, solver.getResult())
    }
}