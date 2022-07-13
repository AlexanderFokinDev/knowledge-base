package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.SingleNumber

class SingleNumberTest {

    @Test
    fun singleNumber() {
        val nums = intArrayOf(3,2,3,1,1)
        val target = 2
        val solver = SingleNumber(nums)
        assertEquals(target, solver.getResult())
    }
}