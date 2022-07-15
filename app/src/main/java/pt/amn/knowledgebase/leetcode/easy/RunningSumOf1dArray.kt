package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Дан массив. Вернуть массив того же размера. Значения в массиве,
 * это сумма элементов старого массива от нулевого индекса до текущего.
 */
class RunningSumOf1dArray(val nums: IntArray) : Solution<IntArray> {
    override fun getResult(): IntArray {
        val result = IntArray(nums.size)
        result[0] = nums[0]
        for (i in 1 until nums.size) {
            result[i] = nums[i] + result[i - 1]
        }
        return result
    }
}