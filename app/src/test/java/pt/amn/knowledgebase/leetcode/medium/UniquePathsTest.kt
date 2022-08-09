package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test

class UniquePathsTest {

    @Test
    fun uniquePathsTest1() {
        assertEquals(28, UniquePaths(3, 7).getResult())
    }

    @Test
    fun uniquePathsTest2() {
        assertEquals(3, UniquePaths(3, 2).getResult())
    }
}