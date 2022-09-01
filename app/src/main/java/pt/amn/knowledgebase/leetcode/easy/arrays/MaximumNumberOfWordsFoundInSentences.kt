package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * A sentence is a list of words that are separated by a single space with no leading
 * or trailing spaces.
 *
 * You are given an array of strings sentences, where each sentences[i] represents
 * a single sentence.
 *
 * Return the maximum number of words that appear in a single sentence.
 */
class MaximumNumberOfWordsFoundInSentences(private val sentences: Array<String>) : Solution<Int> {

    override fun getResult(): Int {

        var maxWords = 0

        for (sentence in sentences) {
            var countOfSpaces = 0
            for (symbol in sentence) {
                if (symbol == ' ') countOfSpaces++
            }
            if (countOfSpaces > maxWords) maxWords = countOfSpaces
        }

        return maxWords+1
    }
}