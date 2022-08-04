package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

class LongestPalindrome(private val s: String) : Solution<Int> {

    override fun getResult(): Int {

        if (s.length > 1) {
            return solveIteration(s)
        }

        return 1
    }

    fun solveIteration(word: String) : Int {

        val letters = word.toCharArray()
        var longest = 0
        val groupLetter = letters.groupBy { it }
        var unicLetter = ' '
        var countOddGroup = 0
        var countEvenGroup = 0
        var lastOddGroupLetter = ' '

        for(gr in groupLetter) {

            if (gr.value.size % 2 == 0) {
                longest += gr.value.size
                countEvenGroup++
            } else if (gr.value.size > 2) {
                longest += gr.value.size
                countOddGroup++
                lastOddGroupLetter = gr.key
            }
            else {
                unicLetter = gr.key
            }

        }

        return if (longest == letters.size && countOddGroup <= 1) {
            return longest
        } else if (longest == letters.size && countEvenGroup == 0) {
            return longest
        } else if (longest == letters.size-1 && countOddGroup % 2 == 0) {
            return longest+1
        }
        else {
            if(unicLetter != ' ') {
                solveIteration(word.replace(unicLetter.toString(), ""))
            } else {
                solveIteration(word.replaceFirst(lastOddGroupLetter.toString(), ""))
            }
        }

    }
}