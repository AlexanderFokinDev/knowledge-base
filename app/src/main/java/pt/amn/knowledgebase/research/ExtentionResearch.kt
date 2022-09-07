package pt.amn.knowledgebase.research

class ExtentionResearch {

}

// В байт-код Java это будет выглядеть так:
//	@NotNull()
//  public final static removeSemicolon(String) String;
fun String.removeSemicolon(): String {
    return this.replace(";", "")
}