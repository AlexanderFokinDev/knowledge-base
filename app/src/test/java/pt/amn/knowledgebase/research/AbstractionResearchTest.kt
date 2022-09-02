package pt.amn.knowledgebase.research

import org.junit.Assert.*
import org.junit.Test

class AbstractionResearchTest {

    @Test
    fun testDescendantOfAbstractClass() {

        val abstractTest = AbstractionResearch()
        abstractTest.testDescendantOfAbstractClass()

        assertTrue(true)
    }

    @Test
    fun testDescendantOfInterface() {

        val abstractTest = AbstractionResearch()
        abstractTest.testDescendantOfInterface()

        assertTrue(true)
    }
}