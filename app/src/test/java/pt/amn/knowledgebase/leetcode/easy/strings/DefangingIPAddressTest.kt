package pt.amn.knowledgebase.leetcode.easy.strings

import org.junit.Assert.*
import org.junit.Test

class DefangingIPAddressTest {

    @Test
    fun defangingIPAddressTest1() {

        assertEquals("1[.]1[.]1[.]1", DefangingIPAddress("1.1.1.1").getResult())
    }

    @Test
    fun defangingIPAddressTest2() {

        assertEquals("255[.]100[.]50[.]0", DefangingIPAddress("255.100.50.0").getResult())
    }
}