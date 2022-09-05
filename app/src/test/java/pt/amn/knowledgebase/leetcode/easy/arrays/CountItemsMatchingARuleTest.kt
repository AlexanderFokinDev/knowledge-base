package pt.amn.knowledgebase.leetcode.easy.arrays

import org.junit.Assert.*
import org.junit.Test

class CountItemsMatchingARuleTest {

    @Test
    fun countItemsMatchingARuleTest1() {

        val list1 = listOf(
            listOf("phone", "blue", "pixel"), listOf("computer", "silver", "lenovo"),
            listOf("phone", "gold", "iphone")
        )
        assertEquals(1,
            CountItemsMatchingARule(list1, "color", "silver").getResult())
    }

    @Test
    fun countItemsMatchingARuleTest2() {

        val list1 = listOf(
            listOf("phone","blue","pixel"), listOf("computer","silver","phone"),
            listOf("phone","gold","iphone")
        )
        assertEquals(2,
            CountItemsMatchingARule(list1, "type", "phone").getResult())
    }
}