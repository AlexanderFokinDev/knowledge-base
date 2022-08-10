package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner
 * (i.e., grid[0][0]). The robot tries to move to the bottom-right corner
 * (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 *
 * Given the two integers m and n, return the number of possible unique paths that the robot
 * can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
class UniquePaths(private val m: Int, private val n: Int) : Solution<Int> {

    /**
     * we have 4 cases here
     *
     * robot stands at cell [1, 1] then we have only one unique path -> just stand and do nothing
     * if robot goes at first row [1, j] unique paths to this cell is equals to cell[1, j - 1] or just 1
     * if robot goes at first column [i, 1] we also have unique paths to this cell is equals to cell[i, 1] or just 1
     * else we need to add number of paths from cell[i - 1, j] to cell[i, j - 1]
     */
    override fun getResult(): Int {

        val field = Array(n) { IntArray(m) }

        for (i in 0 until n) {
            for (j in 0 until m) {
                when {
                    i == 0 && j == 0 -> field[i][j] = 1
                    i == 0 -> field[i][j] = field[i][j-1]
                    j == 0 -> field[i][j] = field[i-1][j]
                    else -> {
                        field[i][j] = field[i][j-1] + field[i-1][j]
                    }
                }
            }
        }

        return field.last().last()
    }

    /**
     * Brute force method
      */
    /*private val field = Array(m) { IntArray(n) }
    private var countOfWays = 0

    override fun getResult(): Int {

        if (m == 1 && n == 1) return 1

        nextStep(0, 0)

        return countOfWays
    }

    private fun nextStep(startRow: Int, startColumn: Int) {

        val stepDown = checkCell(startRow + 1, startColumn)
        if (stepDown == CellType.AVAILABLE) {
            nextStep(startRow + 1, startColumn)
        } else if (stepDown == CellType.FINISH) {
            countOfWays++
            return
        }

        val stepRight = checkCell(startRow, startColumn + 1)
        if (stepRight == CellType.AVAILABLE) {
            nextStep(startRow, startColumn + 1)
        } else if (stepRight == CellType.FINISH) {
            countOfWays++
        }
    }

    private fun checkCell(row: Int, column: Int) : CellType {

        return if (row < 0 || column < 0 || row >= field.size || column >= field[0].size) {
            CellType.BEYOND
        } else if (row == field.size - 1 && column == field[0].size - 1) {
            CellType.FINISH
        } else {
            CellType.AVAILABLE
        }
    }

    enum class CellType {
        BEYOND,
        AVAILABLE,
        FINISH
    }*/

}