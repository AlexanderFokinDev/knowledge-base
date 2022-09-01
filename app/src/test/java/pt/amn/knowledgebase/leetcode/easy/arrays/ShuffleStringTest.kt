package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class ShuffleStringTest {

    @Test
    fun shuffleStringTest1() {
        assertEquals(
            "leetcode",
            ShuffleString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)).getResult()
        )
    }

    @Test
    fun shuffleStringTest2() {
        assertEquals(
            "abc",
            ShuffleString("abc", intArrayOf(0,1,2)).getResult()
        )
    }

    @Test
    fun shuffleStringTest3() {
        assertEquals(
            "nihao",
            ShuffleString("aiohn", intArrayOf(3,1,4,2,0)).getResult()
        )
    }
}