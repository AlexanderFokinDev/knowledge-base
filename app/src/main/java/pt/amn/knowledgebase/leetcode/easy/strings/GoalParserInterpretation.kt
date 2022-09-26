package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You own a Goal Parser that can interpret a string command. The command consists of
 * an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G"
 * as the string "G", "()" as the string "o", and "(al)" as the string "al".
 * The interpreted strings are then concatenated in the original order.
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 */
class GoalParserInterpretation(private val command: String) : Solution<String> {

    override fun getResult(): String {

        /* Simple variant
        var parseStr = command.replace("()", "o")
        parseStr = parseStr.replace("(al)", "al")
        return parseStr
         */

        val parseStr = StringBuilder("")
        for ((index, symbol) in command.withIndex()) {
            if (symbol != '(' && symbol != ')') {
                parseStr.append(symbol)
            } else if (index < command.length-1 && symbol == '(' && command[index+1] == ')') {
                parseStr.append('o')
            }
        }

        return parseStr.toString()
    }
}