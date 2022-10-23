package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given a string array words, return an array of all characters that show up in all strings
 * within the words (including duplicates). You may return the answer in any order.
 */
class FindCommonCharacters(private val words: Array<String>) : Solution<List<String>> {

    override fun getResult(): List<String> {

        var hashMap = hashMapOf<Char, Int>()
        words[0].forEach { symbol ->
            hashMap.put(symbol, hashMap.getOrDefault(symbol, 0) + 1)
        }

        for(i in 1 until words.size) {

            val newHashMap = hashMapOf<Char, Int>()

            words[i].forEach { symbol ->

                val foundSymbol = hashMap.get(symbol)
                if (foundSymbol != null) {

                    if (foundSymbol == 1) {
                        hashMap.remove(symbol)
                    } else {
                        hashMap.put(symbol, foundSymbol - 1)
                    }
                    newHashMap.put(symbol, newHashMap.getOrDefault(symbol, 0) + 1)

                }

            }

            hashMap = newHashMap

        }

        val resultList = mutableListOf<String>()
        hashMap.forEach { el ->
            for(i in 0 until el.value) {
                resultList.add(el.key.toString())
            }
        }

        return resultList
    }
}