package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

class ConcatenationArray(val nums: IntArray) : Solution<IntArray> {
    override fun getResult(): IntArray {
        return IntArray(nums.size*2) { numsEl ->
            if(numsEl > nums.size-1) nums[numsEl-nums.size]
            else nums[numsEl]
        }

        /* Other variant
        fun getConcatenation(nums: IntArray): IntArray = IntArray(nums.size*2)
            { nums[it % nums.size] }
        */
    }
}