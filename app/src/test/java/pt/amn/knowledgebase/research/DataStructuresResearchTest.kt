package pt.amn.knowledgebase.research

import org.junit.Assert.*
import org.junit.Test

class DataStructuresResearchTest {

    @Test
    fun arrayListResearchTest1() {

        assertNotEquals(5, DataStructuresResearch().arrayListResearch())
    }

    @Test
    fun listResearchTest() {

        val testList = listOf<Int>()
        assertEquals(0, testList.size)

        // Can't do it
        //testList.add()

        // It must be predetermined
        val testList1 = listOf(1, 3, 5, 7, 9)
        assertEquals(5, testList1.size)
        // Can't change
        //testList1[3] = 3

        // Can't do it
        //testList.add()
    }

    @Test
    fun mutableListResearchTest() {

        val testList = mutableListOf<Int>()
        assertEquals(0, testList.size)

        // Can do it
        testList.add(7)
        assertEquals(1, testList.size)

        testList.removeAt(0)
        assertEquals(0, testList.size)

        // It must be predetermined
        val testList1 = mutableListOf(1, 3, 5, 7, 9)
        assertEquals(5, testList1.size)
        // Can change
        testList1[3] = 3

        testList1.map { element ->
            element*3
        }
        println(testList1)

        testList1.remove(3)
        println(testList1)

        // Can do it
        testList1.add(8)
    }

    @Test
    fun linkedListResearchTest() {

        assertEquals(3, DataStructuresResearch().linkedListResearch())
    }
}