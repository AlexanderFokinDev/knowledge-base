package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution
import java.util.Arrays.copyOfRange

class Permutations(val nums: IntArray) : Solution<List<List<Int>>> {

    // Creating a data structure
    val sizeOfResultList = factorial(nums.size)
    private val resultList: List<MutableList<Int>> = List(sizeOfResultList) {
        MutableList(nums.size) {
            1
        }
    }

    override fun getResult(): List<List<Int>> {
        solveIteration(nums, 0)
        return resultList
    }

    private fun solveIteration(numbers: IntArray, column: Int, offset: Int = 0) {

        if (numbers.isEmpty()) return

        val rowCount = factorial(numbers.size)
        val rowForOneNumber = rowCount / numbers.size

        for ((index, value) in numbers.withIndex()) {
            for (row in 0 until rowForOneNumber) {
                resultList[row + (index * rowForOneNumber) + offset][column] = value
            }
            solveIteration(getNewArray(numbers, value), column+1, offset + index * rowForOneNumber)
        }
    }

    fun getNewArray(numbers: IntArray, usedNumber: Int) : IntArray {
        val newArray = IntArray(numbers.size-1)
        var index = 0
        for (num in numbers) {
            if (num == usedNumber) continue
            newArray[index] = num
            index++
        }
        return newArray
    }

    fun factorial(number: Int) : Int {

        var result = 1
        for (i in 2..number) {
            result *= i
        }
        return result
    }
}