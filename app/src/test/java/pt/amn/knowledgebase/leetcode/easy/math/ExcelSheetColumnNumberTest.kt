package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.easy.math.ExcelSheetColumnNumber

class ExcelSheetColumnNumberTest {

    @Test
    fun excelSheetColumnNumberTestA() {
        val expected = 1
        assertEquals(expected, ExcelSheetColumnNumber("A").getResult())
    }

    @Test
    fun excelSheetColumnNumberTestAB() {
        val expected = 28
        assertEquals(expected, ExcelSheetColumnNumber("AB").getResult())
    }

    @Test
    fun excelSheetColumnNumberTestZY() {
        val expected = 701
        assertEquals(expected, ExcelSheetColumnNumber("ZY").getResult())
    }
}