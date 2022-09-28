package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 *
 * Only include the sum of all the elements on the primary diagonal and all the elements
 * on the secondary diagonal that are not part of the primary diagonal.
 */
class MatrixDiagonalSum(private val mat: Array<IntArray>) : Solution<Int> {

    override fun getResult(): Int {

        var sum = 0

        for (i in mat.indices) {
            sum += mat[i][i]
        }

        var i = 0
        for (j in mat.size-1 downTo 0) {
            sum += mat[i][j]
            i++
        }

        if (mat.size % 2 != 0) {
            val mid = (mat.size / 2)
            sum -= mat[mid][mid]
        }

        return sum
    }
}