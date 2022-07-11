package pt.amn.knowledgebase.leetcode

import org.junit.Assert.*
import org.junit.Test

class MajorityElementTest {

    @Test
    fun majorityElement1() {
        val nums = intArrayOf(3,2,3)
        val target = 3
        val solver = MajorityElement(nums)
        assertEquals(target, solver.getResult())
    }

    @Test
    fun majorityElement2() {
        val nums = intArrayOf(2,2,1,1,1,2,2)
        val target = 2
        val solver = MajorityElement(nums)
        assertEquals(target, solver.getResult())
    }

    @Test
    fun majorityElement3() {
        val nums = intArrayOf(1)
        val target = 1
        val solver = MajorityElement(nums)
        assertEquals(target, solver.getResult())
    }
}