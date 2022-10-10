package pt.amn.knowledgebase.leetcode.easy.greedy

import org.junit.Assert.*
import org.junit.Test

class SplitAStringInBalancedStringsTest {

    @Test
    fun splitAStringInBalancedStringsTest1() {
        assertEquals(4, SplitAStringInBalancedStrings("RLRRLLRLRL").getResult())
    }

    @Test
    fun splitAStringInBalancedStringsTest2() {
        assertEquals(2, SplitAStringInBalancedStrings("RLRRRLLRLL").getResult())
    }

    @Test
    fun splitAStringInBalancedStringsTest3() {
        assertEquals(1, SplitAStringInBalancedStrings("LLLLRRRR").getResult())
    }
}