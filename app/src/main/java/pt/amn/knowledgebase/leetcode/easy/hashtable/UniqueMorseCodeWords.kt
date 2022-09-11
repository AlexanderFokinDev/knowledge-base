package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series
 * of dots and dashes, as follows:
 *
 * 'a' maps to ".-",
 * 'b' maps to "-...",
 * 'c' maps to "-.-.", and so on.
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--."
 * ,"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Given an array of strings words where each word can be written as a concatenation
 * of the Morse code of each letter.
 *
 * For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-",
 * and "-...". We will call such a concatenation the transformation of a word.
 * Return the number of different transformations among all words we have.
 */
class UniqueMorseCodeWords(private var words: Array<String>) : Solution<Int> {

    override fun getResult(): Int {

        val morzeMap = getMorzeMap()
        val setTransformations = mutableSetOf<String>()

        for (word in words) {
            setTransformations.add(decodeWord(word, morzeMap))
        }

        return setTransformations.size
    }

    private fun decodeWord(word: String, morzeMap: Map<Char, String>): String {

        var decodeWord = ""
        word.map { symbol ->
            decodeWord += morzeMap[symbol]
        }

        return decodeWord
    }

    private fun getMorzeMap() : Map<Char, String> {

        val listMorze = listOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )

        val morzeMap = mutableMapOf<Char, String>()

        var index = 0
        for (letter in 'a'..'z') {
            morzeMap.put(letter, listMorze[index])
            index++
        }

        return morzeMap.toMap()
    }
}