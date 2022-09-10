package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given the strings key and message, which represent a cipher key and a secret message,
 * respectively. The steps to decode message are as follows:
 *
 * Use the first appearance of all 26 lowercase English letters in key as the order of the
 * substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter
 * in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c',
 * 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 *
 * Return the decoded message.
 */
class DecodeTheMessage(private val key: String, private val message: String) : Solution<String> {

    override fun getResult(): String {

        val keyMap = getKeyMap(key)

        var secretMessage = ""
        for (symbol in message) {
            if (symbol == ' ') {
                secretMessage += symbol
            } else {
                secretMessage += keyMap.get(symbol)
            }
        }

        return secretMessage
    }

    private fun getKeyMap(key: String) : HashMap<Char, Char> {

        val alphabet = mutableListOf<Char>()
        for (symbol in 'a'..'z') {
            alphabet.add(symbol)
        }

        val keyMap = hashMapOf<Char, Char>()

        var index = 0
        for (symbol in key) {

            if (!(keyMap.containsKey(symbol) || symbol == ' ')) {
                keyMap.put(symbol, alphabet[index])
                index++
            }
        }

        return keyMap
    }
}