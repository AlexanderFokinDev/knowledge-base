package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.BuildArrayFromPermutation

class BuildArrayFromPermutationTest {

    @Test
    fun buildArrayFromPermutationTest() {
        val nums = intArrayOf(5,0,1,2,3,4)
        val target = intArrayOf(4,5,0,1,2,3)
        val solver = BuildArrayFromPermutation(nums)
        assertArrayEquals(target, solver.getResult())
    }
}