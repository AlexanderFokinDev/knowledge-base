package pt.amn.knowledgebase.research

class ClassesStandartMethodsResearch {

    val rs1 = ResearchSimpleClass(1, "ResearchSimpleClass 1")
    val rs2 = ResearchSimpleClass(2, "ResearchSimpleClass 2")

    val rd1 = ResearchDataClass(3, "ResearchDataClass 3")
    val rd2 = ResearchDataClass(4, "ResearchDataClass 4")
}

class ResearchSimpleClass(val id: Int, val name: String) {

}

data class ResearchDataClass(val id: Int, val name: String)