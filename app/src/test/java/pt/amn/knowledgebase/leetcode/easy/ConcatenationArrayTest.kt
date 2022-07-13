package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class ConcatenationArrayTest {

    @Test
    fun concatenationArray() {
        val nums = intArrayOf(1, 3, 2, 1)
        val target = intArrayOf(1, 3, 2, 1, 1, 3, 2, 1)
        val solver = ConcatenationArray(nums)
        assertArrayEquals(target, solver.getResult())
    }
}