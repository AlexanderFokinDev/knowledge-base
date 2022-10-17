package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import org.junit.Assert.*
import org.junit.Test

class PascalTriangleTest {

    @Test
    fun pascalTriangleTest1() {

        val target = listOf(
            listOf(1),
            listOf(1,1),
            listOf(1,2,1),
            listOf(1,3,3,1),
            listOf(1,4,6,4,1)
        )

        val solver = PascalTriangle(5)
        assertArrayEquals(target.toTypedArray(), solver.getResult().toTypedArray())
    }

    @Test
    fun pascalTriangleTest2() {

        val target = listOf(
            listOf(1)
        )

        val solver = PascalTriangle(1)
        assertArrayEquals(target.toTypedArray(), solver.getResult().toTypedArray())
    }
}