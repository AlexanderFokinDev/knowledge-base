package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    fun kidsWithTheGreatestNumberOfCandies() {
        val candies = intArrayOf(5,3,1,8)
        val target = booleanArrayOf(true,false,false,true)
        val solver = KidsWithTheGreatestNumberOfCandies(candies, 4)
        assertArrayEquals(target, solver.getResult())
    }
}