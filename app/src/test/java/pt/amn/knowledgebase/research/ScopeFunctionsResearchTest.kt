package pt.amn.knowledgebase.research

import org.junit.Test
import org.junit.Assert.*

class ScopeFunctionsResearchTest {

    @Test
    fun scopeWithTest() {

        val addressExpected = Address("Montevideo", "Sabat Pebet","100")

        // Возвращает результат последнего выражения в лямбде
        val address = Address()
        val result = with(address) {
            city = "Montevideo"
            street = "Sabat Pebet"
            apartment = "100"
            "done"
        }

        println(result)

        // Исходный объект изменился
        assertEquals(addressExpected, address)
    }

    @Test
    fun scopeRunTest() {

        val addressExpected = Address("Montevideo", "Sabat Pebet","100")

        // with, run, let, also, apply
        val address = Address()
        address.run {
            city = "Montevideo"
            street = "Sabat Pebet"
            apartment = "100"
        }

        assertEquals(addressExpected, address)

        //////////////////////////////

        var testStr = "Check scope function Run"
        testStr.run { testStr.replace("scope", "") }
            .uppercase()
            .dropLast(4)

        // Исходный объект (строка) не поменяется
        assertNotEquals("CHECK FUNCTION", testStr)
    }

    @Test
    fun scopeLetTest() {

        val addressExpected = Address("Montevideo", "Sabat Pebet","100")

        // with, run, let, also, apply
        val address = Address()
        address.let { addr ->
            addr.city = "Montevideo"
            addr.street = "Sabat Pebet"
            addr.apartment = "100"
        }

        assertEquals(addressExpected, address)

        //////////////////////////////

        var testStr = "Check scope function Run"
        testStr.let { str ->
            str.replace("scope", "")
        }
            .uppercase()
            .dropLast(4)

        // Исходный объект (строка) не поменяется
        assertNotEquals("CHECK FUNCTION", testStr)
    }

    @Test
    fun scopeAlsoTest() {

        val addressExpected = Address("Montevideo", "Sabat Pebet","100")

        // with, run, let, also, apply
        val address = Address()
        address.also { addr ->
            addr.city = "Montevideo"
            addr.street = "Sabat Pebet"
            addr.apartment = "100"
        }

        assertEquals(addressExpected, address)

        //////////////////////////////

        var testStr = "Check scope function Run"
        testStr.also { str ->
            str.replace("scope", "")
        }
            .uppercase()
            .dropLast(4)

        // Исходный объект (строка) не поменяется
        assertNotEquals("CHECK FUNCTION", testStr)
    }

    @Test
    fun scopeApplyTest() {

        val addressExpected = Address("Montevideo", "Sabat Pebet","100")

        // with, run, let, also, apply
        val address = Address().apply {
            city = "Montevideo"
            street = "Sabat Pebet"
            apartment = "100"
        }

        assertEquals(addressExpected, address)

        //////////////////////////////

        var testStr = "Check scope function Run".apply {
            this.replace("scope", "")
        }
            .uppercase()
            .dropLast(4)

        // Исходный объект (строка) не поменяется
        assertNotEquals("CHECK FUNCTION", testStr)
    }

    data class Address(var city: String = "", var street: String = "", var apartment: String = "")
}