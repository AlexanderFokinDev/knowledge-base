package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are playing the Bulls and Cows game with your friend.
 *
 * You write down a secret number and ask your friend to guess what the number is.
 * When your friend makes a guess, you provide a hint with the following info:
 *
 * The number of "bulls", which are digits in the guess that are in the correct position.
 * The number of "cows", which are digits in the guess that are in your secret number
 * but are located in the wrong position. Specifically, the non-bull digits in the guess
 * that could be rearranged such that they become bulls.
 * Given the secret number secret and your friend's guess guess,
 * return the hint for your friend's guess.
 *
 * The hint should be formatted as "xAyB", where x is the number of bulls and y
 * is the number of cows. Note that both secret and guess may contain duplicate digits.
 */
class BullsAndCows(private val secret: String, private val guess: String) : Solution<String> {

    override fun getResult(): String {

        var countBull = 0
        var countCows = 0

        val hashMapSecret = hashMapOf<Char, Int>()
        for (letter in '0'..'9') {
            hashMapSecret.put(letter, 0)
        }

        val hashMapGuess = hashMapOf<Char, Int>()
        for (letter in '0'..'9') {
            hashMapGuess.put(letter, 0)
        }

        for ((index, letter) in secret.withIndex()) {
            if (letter == guess[index]) {
                countBull++
            } else {
                val letterValue = hashMapSecret.getOrDefault(letter, 0)
                val letterGuessValue = hashMapGuess.getOrDefault(guess[index], 0)
                hashMapSecret.put(letter, letterValue+1)
                hashMapGuess.put(guess[index], letterGuessValue+1)
            }
        }

        for (entry in hashMapGuess) {
            val secretValue = hashMapSecret.getOrDefault(entry.key, 0)
            val guessValue = hashMapGuess.getOrDefault(entry.key, 0)
            if (minOf(secretValue, guessValue) > 0) {
                    countCows += minOf(secretValue, guessValue)
                }
        }

        return "${countBull}A${countCows}B"
    }
}