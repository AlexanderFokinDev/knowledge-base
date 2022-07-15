package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class RunningSumOf1dArrayTest {

    @Test
    fun runningSumOf1dArray() {
        val nums = intArrayOf(5,0,1,2)
        val target = intArrayOf(5,5,6,8)
        val solver = RunningSumOf1dArray(nums)
        assertArrayEquals(target, solver.getResult())
    }
}