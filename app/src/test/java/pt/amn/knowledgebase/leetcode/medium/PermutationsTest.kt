package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class PermutationsTest {

    @Test
    fun permutationsTest1() {

        val target = listOf(
            listOf(1,2,3),
            listOf(1,3,2),
            listOf(2,1,3),
            listOf(2,3,1),
            listOf(3,1,2),
            listOf(3,2,1)
        )

        val solver = Permutations(intArrayOf(1,2,3))
        assertArrayEquals(target.toTypedArray(), solver.getResult().toTypedArray())
    }

    @Test
    fun permutationsTest2() {

        val target = listOf(
            listOf(0,1),
            listOf(1,0)
        )

        val solver = Permutations(intArrayOf(0,1))
        assertArrayEquals(target.toTypedArray(), solver.getResult().toTypedArray())
    }

    @Test
    fun permutationsTest3() {

        val target = listOf(
            listOf(1)
        )

        val solver = Permutations(intArrayOf(1))
        assertArrayEquals(target.toTypedArray(), solver.getResult().toTypedArray())
    }

    @Test
    fun factorialTest1() {
        val solver = Permutations(intArrayOf(1,2,3))
        assertEquals(6, solver.factorial(3))
    }

    @Test
    fun factorialTest2() {
        val solver = Permutations(intArrayOf(1))
        assertEquals(1, solver.factorial(1))
    }

    @Test
    fun factorialTest3() {
        val solver = Permutations(intArrayOf(1,2,3,4))
        assertEquals(24, solver.factorial(4))
    }
}