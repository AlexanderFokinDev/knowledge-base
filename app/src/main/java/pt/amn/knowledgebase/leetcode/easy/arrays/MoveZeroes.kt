package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/** Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 * */
class MoveZeroes(val nums: IntArray) : Solution<Unit> {
    override fun getResult() {

        // Bumble sorting
        var index = 0
        var isMove: Boolean
        while(index < nums.size) {

            isMove = false

            if (nums[index] != 0) {
                index++
                continue
            }

            for(i in index+1 until nums.size) {
                if (nums[i] != 0) {
                    isMove = true
                    // Kotlin style
                    nums[i-1] = nums[i].also { nums[i] = nums[i-1] }
                    // or clear way
                    /*var temp = nums[i-1]
                    nums[i-1] = nums[i]
                    nums[i] = temp*/
                }
            }

            if (!isMove) index++
        }

    }
}