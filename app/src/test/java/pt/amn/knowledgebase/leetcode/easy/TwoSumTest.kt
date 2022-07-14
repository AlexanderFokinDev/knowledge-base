package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.TwoSum

class TwoSumTest {

    @Test
    fun twoSum() {
        val nums = intArrayOf(3, 6, 7, 4, 3, 2, 7, 1, 10, 9)
        val target = 7
        val solver = TwoSum(nums, target)
        assertArrayEquals(intArrayOf(0, 3), solver.getResult())
    }

}