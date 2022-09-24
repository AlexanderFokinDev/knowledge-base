package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class MatrixDiagonalSumTest {

    @Test
    fun matrixDiagonalSumTest1() {

        assertEquals(
            25, MatrixDiagonalSum(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(4, 5, 6),
                    intArrayOf(7, 8, 9)
                )
            ).getResult()
        )
    }

    @Test
    fun matrixDiagonalSumTest2() {

        assertEquals(
            8, MatrixDiagonalSum(
                arrayOf(
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1)
                )
            ).getResult()
        )
    }

    @Test
    fun matrixDiagonalSumTest3() {

        assertEquals(
            5, MatrixDiagonalSum(
                arrayOf(
                    intArrayOf(5)
                )
            ).getResult()
        )
    }
}