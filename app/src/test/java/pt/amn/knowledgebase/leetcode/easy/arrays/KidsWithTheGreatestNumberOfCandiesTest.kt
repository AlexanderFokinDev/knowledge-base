package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.KidsWithTheGreatestNumberOfCandies

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    fun kidsWithTheGreatestNumberOfCandies() {
        val candies = intArrayOf(5,3,1,8)
        val target = booleanArrayOf(true,false,false,true)
        val solver = KidsWithTheGreatestNumberOfCandies(candies, 4)
        assertArrayEquals(target, solver.getResult())
    }
}