package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class DestinationCityTest {

    @Test
    fun destinationCityTest1() {
        assertEquals(
            "Sao Paulo", DestinationCity(
                listOf(
                    listOf("London", "New York"),
                    listOf("New York", "Lima"), listOf("Lima", "Sao Paulo")
                )
            ).getResult()
        )
    }

    @Test
    fun destinationCityTest2() {
        assertEquals(
            "A", DestinationCity(
                listOf(
                    listOf("B","C"),
                    listOf("D","B"), listOf("C","A")
                )
            ).getResult()
        )
    }

    @Test
    fun destinationCityTest3() {
        assertEquals(
            "Z", DestinationCity(
                listOf(
                    listOf("A","Z")
                )
            ).getResult()
        )
    }
}