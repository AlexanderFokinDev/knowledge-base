package pt.amn.knowledgebase.leetcode

import org.junit.Assert.*
import org.junit.Test

class SingleNumberTest {

    @Test
    fun singleNumber() {
        val nums = intArrayOf(3,2,3,1,1)
        val target = 2
        val solver = SingleNumber(nums)
        assertEquals(target, solver.getResult())
    }
}