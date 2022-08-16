package pt.amn.knowledgebase.research

import org.junit.Assert.*
import org.junit.Test

class ClassesStandartMethodsResearchTest {

    @Test
    fun `Two objects of the class are not equals, and its fields too`() {

        val expected = false

        val rs1 = ResearchSimpleClass(1, "ResearchSimpleClass 1")
        val rs2 = ResearchSimpleClass(2, "ResearchSimpleClass 2")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchSimpleClass, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(2, hashMap.size)
    }

    @Test
    fun `Two objects of the class are not equals, but its fields are`() {

        val expected = false

        val rs1 = ResearchSimpleClass(1, "ResearchSimpleClass 1")
        val rs2 = ResearchSimpleClass(1, "ResearchSimpleClass 1")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchSimpleClass, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(2, hashMap.size)
    }

    @Test
    fun `Two objects of the data class are not equals, and its fields too`() {

        val expected = false

        val rs1 = ResearchDataClass(1, "ResearchDataClass 1")
        val rs2 = ResearchDataClass(2, "ResearchDataClass 2")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchDataClass, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(2, hashMap.size)
    }

    @Test
    fun `Two objects of the data class are equals, and its fields too`() {

        val expected = true

        val rs1 = ResearchDataClass(1, "ResearchDataClass 1")
        val rs2 = ResearchDataClass(1, "ResearchDataClass 1")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchDataClass, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(1, hashMap.size)

        assertEquals(rs1.hashCode(), rs2.hashCode())

        assertFalse(rs1 === rs2)
    }

    @Test
    fun `Object of the data class and his copy are equals, and its fields too`() {

        val expected = true

        val rs1 = ResearchDataClass(1, "ResearchDataClass 1")
        val rs2 = rs1.copy()
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchDataClass, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(1, hashMap.size)

        assertEquals(rs1.hashCode(), rs2.hashCode())
    }

    @Test
    fun `Two objects of the override class are not equals, and its fields too`() {

        val expected = false

        val rs1 = ResearchSimpleClassWithOverrideMetods(1, "ResearchSimpleClassWithOverrideMetods 1")
        val rs2 = ResearchSimpleClassWithOverrideMetods(2, "ResearchSimpleClassWithOverrideMetods 2")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchSimpleClassWithOverrideMetods, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(2, hashMap.size)
    }

    @Test
    fun `Two objects of the override class are not equals, but its fields are`() {

        val expected = true

        val rs1 = ResearchSimpleClassWithOverrideMetods(1, "ResearchSimpleClassWithOverrideMetods 1")
        val rs2 = ResearchSimpleClassWithOverrideMetods(1, "ResearchSimpleClassWithOverrideMetods 1")
        val actual = ClassesStandartMethodsResearch(rs1, rs2).getResult()

        assertEquals(expected, actual)

        val hashMap = hashMapOf<ResearchSimpleClassWithOverrideMetods, Int>()
        hashMap.put(rs1, 1)
        hashMap.put(rs2, 2)
        assertEquals(1, hashMap.size)
    }

}