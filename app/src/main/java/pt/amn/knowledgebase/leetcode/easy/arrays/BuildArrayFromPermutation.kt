package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Дан массив. Необходимо создать новый массив, количество элементов в котором равно исходному.
 * Значения в новом массиве = nums[nums[i]]
 */
class BuildArrayFromPermutation(val nums: IntArray) : Solution<IntArray> {
    override fun getResult(): IntArray = IntArray(nums.size) { nums[nums[it]] }
}