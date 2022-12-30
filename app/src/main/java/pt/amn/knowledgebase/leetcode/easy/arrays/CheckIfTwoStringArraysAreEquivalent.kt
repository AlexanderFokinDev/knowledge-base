package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

class CheckIfTwoStringArraysAreEquivalent(
    private val word1: Array<String>,
    private val word2: Array<String>
) : Solution<Boolean> {

    override fun getResult(): Boolean {

        var string1 = ""
        var string2 = ""

        word1.forEach { el ->
            string1 += el
        }

        word2.forEach { el ->
            string2 += el
        }

        return string1 == string2

    }
}