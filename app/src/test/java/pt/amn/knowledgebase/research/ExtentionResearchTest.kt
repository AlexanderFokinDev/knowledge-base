package pt.amn.knowledgebase.research

import org.junit.Assert.*
import org.junit.Test

class ExtentionResearchTest {

    @Test
    fun removeSemicolonExtentionTest() {
        var str = "line1;new one"
        assertEquals("line1new one", str.removeSemicolon())
    }
}