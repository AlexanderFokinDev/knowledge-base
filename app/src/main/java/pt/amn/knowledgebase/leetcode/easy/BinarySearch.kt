package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
class BinarySearch(private val nums: IntArray, private val target: Int) : Solution<Int> {

    override fun getResult(): Int {

        var startRange = 0
        var finishRange = nums.size-1

        while (true) {

            // Safe from big numbers
            var middle = (startRange/2 + finishRange/2)
            if ((startRange+finishRange)/2 > middle) middle++

            if (nums[middle] == target) return middle
            else if (finishRange == startRange) break
            else if (nums[middle] < target) {
                startRange = if (middle>startRange) middle else middle+1
            } else {
                finishRange = middle
            }
        }

        return -1
    }
}