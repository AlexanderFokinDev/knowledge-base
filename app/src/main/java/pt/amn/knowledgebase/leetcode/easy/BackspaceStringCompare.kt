package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution
import java.util.*

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty
 * text editors. '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 */
class BackspaceStringCompare(private val s: String, private val t: String) : Solution<Boolean> {

    override fun getResult(): Boolean {

        return getStringWithoutBackspaces(s) == getStringWithoutBackspaces(t)
    }

    fun getStringWithoutBackspaces(input: String) : String {

        var stackS = 0
        var newS = ""
        for (index in input.length - 1 downTo 0) {
            if (input[index] == '#') {
                stackS++
            } else if (stackS == 0) {
                newS += input[index]
            } else {
                stackS--
            }
        }

        return newS
    }
}