package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.MissingNumber

class MissingNumberTest {

    @Test
    fun missingNumber() {
        var nums = intArrayOf(9,6,4,2,3,5,7,0,1)
        assertEquals(8, MissingNumber(nums).getResult())

        nums = intArrayOf(0,1)
        assertEquals(2, MissingNumber(nums).getResult())

        nums = intArrayOf(3,0,1)
        assertEquals(2, MissingNumber(nums).getResult())

        nums = intArrayOf(1)
        assertEquals(0, MissingNumber(nums).getResult())
    }
}