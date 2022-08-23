package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class FinalValueVariableAfterPerformingOperationsTest {

    @Test
    fun finalValueVariableAfterPerformingOperationsTest1() {

        assertEquals(
            1,
            FinalValueVariableAfterPerformingOperations(arrayOf("--X", "X++", "X++")).getResult()
        )
    }

    @Test
    fun finalValueVariableAfterPerformingOperationsTest2() {

        assertEquals(
            3,
            FinalValueVariableAfterPerformingOperations(arrayOf("++X","++X","X++")).getResult()
        )
    }

    @Test
    fun finalValueVariableAfterPerformingOperationsTest3() {

        assertEquals(
            0,
            FinalValueVariableAfterPerformingOperations(arrayOf("X++","++X","--X","X--")).getResult()
        )
    }
}