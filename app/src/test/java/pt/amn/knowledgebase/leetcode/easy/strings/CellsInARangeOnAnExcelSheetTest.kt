package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test

class CellsInARangeOnAnExcelSheetTest {

    @Test
    fun cellsInARangeOnAnExcelSheetTest1() {
        assertArrayEquals(
            listOf("K1", "K2", "L1", "L2").toTypedArray(),
            CellsInARangeOnAnExcelSheet("K1:L2").getResult().toTypedArray()
        )
    }

    @Test
    fun cellsInARangeOnAnExcelSheetTest2() {
        assertArrayEquals(
            listOf("A1", "B1", "C1", "D1", "E1", "F1").toTypedArray(),
            CellsInARangeOnAnExcelSheet("A1:F1").getResult().toTypedArray()
        )
    }
}