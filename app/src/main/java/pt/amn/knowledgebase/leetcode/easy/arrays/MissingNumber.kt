package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Constraints:
 * n == nums.length
 * 1 <= n <= 104
 * 0 <= nums\[i] <= n
 * All the numbers of nums are unique.
 */
class MissingNumber(val nums: IntArray) : Solution<Int> {
    override fun getResult(): Int {
        nums.sort()
        for ((index, value) in nums.withIndex()) {
            if (index != value) return index
        }
        return nums.size
    }

}
