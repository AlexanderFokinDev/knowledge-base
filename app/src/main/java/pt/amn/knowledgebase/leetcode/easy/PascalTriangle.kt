package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
class PascalTriangle(val numRows: Int) : Solution<List<List<Int>>> {

    override fun getResult(): List<List<Int>> {

        // Creating a data structure
        val resultList: List<MutableList<Int>> = List(numRows) { row ->
            MutableList(row+1){1}
        }

        // Counting
        for (row in 2 until numRows) {

            for (column in 1 until resultList[row].size-1) {
                resultList[row][column] = resultList[row-1][column] + resultList[row-1][column-1]
            }

        }

        return resultList
    }
}