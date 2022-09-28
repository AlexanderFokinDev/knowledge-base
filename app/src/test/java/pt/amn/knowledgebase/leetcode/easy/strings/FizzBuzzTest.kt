package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.strings.FizzBuzz

class FizzBuzzTest {

    @Test
    fun fizzBuzz() {
        val target = arrayOf("1","2","Fizz","4","Buzz")
        val solver = FizzBuzz(5)
        assertArrayEquals(target, solver.getResult())
    }
}