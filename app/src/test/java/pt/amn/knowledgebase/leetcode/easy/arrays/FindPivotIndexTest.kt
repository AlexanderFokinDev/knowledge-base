package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.arrays.FindPivotIndex

class FindPivotIndexTest {

    @Test
    fun findPivotIndexTest1() {
        assertEquals(3, FindPivotIndex(intArrayOf(1,7,3,6,5,6)).getResult())
    }

    @Test
    fun findPivotIndexTest2() {
        assertEquals(-1, FindPivotIndex(intArrayOf(1,2,3)).getResult())
    }

    @Test
    fun findPivotIndexTest3() {
        assertEquals(0, FindPivotIndex(intArrayOf(2,1,-1)).getResult())
    }
}