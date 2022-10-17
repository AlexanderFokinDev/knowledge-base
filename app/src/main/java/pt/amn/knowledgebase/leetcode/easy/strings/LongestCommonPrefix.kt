package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string ""
 */
class LongestCommonPrefix(val strs: Array<String>) : Solution<String> {
    override fun getResult(): String {
        var prefix = ""
        var countCommonElements = 0
        var index = 0

        for(s in strs[0]) {

            for(str in strs) {
                if(index > str.length-1) continue
                if(str[index]==s) countCommonElements++
            }

            if (countCommonElements == strs.size) {
                prefix += s
            } else {
                return prefix
            }

            index++
            countCommonElements = 0
        }

        return prefix
    }
}