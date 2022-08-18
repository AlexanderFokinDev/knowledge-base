package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
class ShuffleTheArray(private val nums: IntArray, private val n: Int) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val resultArray = IntArray(nums.size)

        var el = 0
        for (i in 0 until n) {
            resultArray[el] = nums[i]
            resultArray[el+1] = nums[i+n]
            el += 2
        }

        return resultArray
    }
}