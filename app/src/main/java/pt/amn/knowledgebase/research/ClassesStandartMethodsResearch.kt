package pt.amn.knowledgebase.research

import pt.amn.knowledgebase.leetcode.Solution

class ClassesStandartMethodsResearch(private val ob1: Any, private val ob2: Any) :
    Solution<Boolean> {

    override fun getResult(): Boolean {

        println("ob1 $ob1")
        println("hash: ${ob1.hashCode()}")
        println("ob2 $ob2")
        println("hash: ${ob2.hashCode()}")
        println("_________________________________________")

        return ob1 == ob2
    }
}

class ResearchSimpleClass(val id: Int, val name: String) {
}

data class ResearchDataClass(val id: Int, val name: String)

class ResearchSimpleClassWithOverrideMetods(val id: Int, val name: String) {

    override fun equals(other: Any?): Boolean {

        if (other is ResearchSimpleClassWithOverrideMetods) {
            return id == other.id && name == other.name
        } else {
            return super.equals(other)
        }
    }

    override fun hashCode(): Int {
        return 31 + id*9
    }

    override fun toString(): String {
        return "ResearchSimpleClassWithOverrideMetods(id=$id, name=$name)"
    }
}