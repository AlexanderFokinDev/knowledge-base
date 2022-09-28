package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test

class GoalParserInterpretationTest {

    @Test
    fun goalParserInterpretationTest1() {

        assertEquals("Goal", GoalParserInterpretation("G()(al)").getResult())
    }

    @Test
    fun goalParserInterpretationTest2() {

        assertEquals("Gooooal", GoalParserInterpretation("G()()()()(al)").getResult())
    }

    @Test
    fun goalParserInterpretationTest3() {

        assertEquals("alGalooG", GoalParserInterpretation("(al)G(al)()()G").getResult())
    }
}