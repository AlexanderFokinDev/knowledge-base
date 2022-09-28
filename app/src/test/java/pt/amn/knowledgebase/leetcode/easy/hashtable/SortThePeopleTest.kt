package pt.amn.knowledgebase.leetcode.easy.hashtable

import org.junit.Assert.*
import org.junit.Test

class SortThePeopleTest {

    @Test
    fun sortThePeopleTest1() {

        assertArrayEquals(
            arrayOf("Mary", "Emma", "John"), SortThePeople(
                arrayOf("Mary", "John", "Emma"),
                intArrayOf(180, 165, 170)
            ).getResult()
        )
    }

    @Test
    fun sortThePeopleTest2() {

        assertArrayEquals(
            arrayOf("Bob", "Alice", "Bob"), SortThePeople(
                arrayOf("Alice", "Bob", "Bob"),
                intArrayOf(155, 185, 150)
            ).getResult()
        )
    }
}