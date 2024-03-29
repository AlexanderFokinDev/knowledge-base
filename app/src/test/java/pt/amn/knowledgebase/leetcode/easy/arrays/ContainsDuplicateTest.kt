package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.ContainsDuplicate

class ContainsDuplicateTest {

    @Test
    fun `contains duplicate`() {
        val nums = intArrayOf(3,2,3,1,1)
        val target = true
        val solver = ContainsDuplicate(nums)
        assertEquals(target, solver.getResult())
    }

    @Test
    fun `Don't contain duplicates`() {
        val nums = intArrayOf(3,2,4,1,5)
        val target = false
        val solver = ContainsDuplicate(nums)
        assertEquals(target, solver.getResult())
    }
}