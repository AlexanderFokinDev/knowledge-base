package pt.amn.knowledgebase.leetcode.easy.strings

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have. Each character in stones is a type of stone
 * you have. You want to know how many of the stones you have are also jewels.
 *
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
class JewelsAndStones(private val jewels: String, private val stones: String) : Solution<Int> {

    override fun getResult(): Int {

        var countOfJewels = 0

        for (stone in stones) {
            if (stone in jewels) countOfJewels++
        }

        return countOfJewels
    }
}