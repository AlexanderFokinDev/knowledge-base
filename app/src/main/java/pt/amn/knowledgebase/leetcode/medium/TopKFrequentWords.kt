package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an array of strings words and an integer k, return the k most frequent strings.
 *
 * Return the answer sorted by the frequency from highest to lowest. Sort the words with
 * the same frequency by their lexicographical order.
 */
class TopKFrequentWords(private val words: Array<String>, private val k: Int) :
    Solution<List<String>> {

    override fun getResult(): List<String> {

        val mapWords = mutableMapOf<String, Int>()
        for (word in words) {
            if (mapWords[word] == null) {
                mapWords.put(word, 1)
            } else {
                mapWords[word] = (mapWords[word] ?: 0) + 1
            }
        }

        val sortedList = mapWords.toList()
            .sortedBy { it.first }
            .sortedByDescending { it.second }

        var result = mutableListOf<String>()

        for (index in 0 until k) {
            result.add(sortedList[index].first)
        }

        return result

    }
}