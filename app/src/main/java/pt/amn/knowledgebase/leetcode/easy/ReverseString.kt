package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

class ReverseString(var input: CharArray) : Solution<CharArray> {
    override fun getResult(): CharArray {

        //input.reversed()

        var start = 0
        var end = input.lastIndex
        while(start < end) {
            input[start] = input[end].also{ input[end] = input[start] }
            start++
            end--
        }

        return input
    }
}