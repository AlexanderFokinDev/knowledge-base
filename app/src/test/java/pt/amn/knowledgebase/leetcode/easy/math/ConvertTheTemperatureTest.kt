package pt.amn.knowledgebase.leetcode.easy.math

import org.junit.Assert.*
import org.junit.Test

class ConvertTheTemperatureTest {

    @Test
    fun convertTheTemperatureTest1() {

        val result = ConvertTheTemperature(36.50).getResult()

        assertArrayEquals(
            doubleArrayOf(309.65000, 97.70000).toTypedArray(),
            result.toTypedArray()
        )
    }

    @Test
    fun convertTheTemperatureTest2() {

        val result = ConvertTheTemperature(122.11).getResult()

        assertArrayEquals(
            doubleArrayOf(395.26000,251.79800).toTypedArray(),
            result.toTypedArray()
        )
    }
}