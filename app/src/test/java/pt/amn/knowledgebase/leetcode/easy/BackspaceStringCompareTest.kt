package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class BackspaceStringCompareTest {

    @Test
    fun backspaceStringCompareTest1() {
        assertEquals(true, BackspaceStringCompare("ab#c", "ad#c").getResult())
    }

    @Test
    fun backspaceStringCompareTest2() {
        assertEquals(true, BackspaceStringCompare("ab##", "c#d#").getResult())
    }

    @Test
    fun backspaceStringCompareTest3() {
        assertEquals(false, BackspaceStringCompare("a#c", "b").getResult())
    }
}