package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class MoveZeroesTest {

    @Test
    fun moveZeroesTest1() {
        val target = intArrayOf(1,3,12,0,0)
        val solver = MoveZeroes(intArrayOf(0,1,0,3,12))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest2() {
        val target = intArrayOf(0)
        val solver = MoveZeroes(intArrayOf(0))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest3() {
        val target = intArrayOf(1,3,12)
        val solver = MoveZeroes(intArrayOf(1,3,12))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest4() {
        val target = intArrayOf(1)
        val solver = MoveZeroes(intArrayOf(1))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest5() {
        val target = intArrayOf(1,0,0)
        val solver = MoveZeroes(intArrayOf(0,0,1))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest6() {
        val target = intArrayOf(1,3,12,0,0)
        val solver = MoveZeroes(intArrayOf(1,0,0,3,12))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }

    @Test
    fun moveZeroesTest7() {
        val target = intArrayOf(73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0)
        val solver = MoveZeroes(intArrayOf(73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0))
        solver.getResult()
        assertArrayEquals(target, solver.nums)
    }
}