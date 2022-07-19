package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTest {

    @Test
    fun fizzBuzz() {
        val target = arrayOf("1","2","Fizz","4","Buzz")
        val solver = FizzBuzz(5)
        assertArrayEquals(target, solver.getResult())
    }
}