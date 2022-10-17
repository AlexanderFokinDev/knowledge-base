package pt.amn.knowledgebase.leetcode.easy.binarysearch

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.binarysearch.FirstBadVersion

class FirstBadVersionTest {

    @Test
    fun firstBadVersionTest_5() {
        assertEquals(4, FirstBadVersion(5, 4).getResult())
    }

    @Test
    fun firstBadVersionTest_1() {
        assertEquals(1, FirstBadVersion(1, 1).getResult())
    }

    @Test
    fun firstBadVersionTest_2() {
        assertEquals(2, FirstBadVersion(2, 2).getResult())
    }

    @Test
    fun firstBadVersionTest_3() {
        assertEquals(3, FirstBadVersion(3, 3).getResult())
    }

    @Test
    fun firstBadVersionTest_2126753390() {
        assertEquals(1702766719, FirstBadVersion(2126753390, 1702766719).getResult())
    }

    @Test
    fun firstBadVersionTest_90() {
        assertEquals(19, FirstBadVersion(90, 19).getResult())
    }

}