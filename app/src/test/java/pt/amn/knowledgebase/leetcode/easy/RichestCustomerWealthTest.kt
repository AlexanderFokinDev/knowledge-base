package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test

class RichestCustomerWealthTest {

    @Test
    fun richestCustomerWealth() {

        val array1 = intArrayOf(1, 2, 3)
        val array2 = intArrayOf(3, 4, 5)
        val accounts = arrayOf(array1, array2)
        assertEquals(12, RichestCustomerWealth(accounts).getResult())

    }
}