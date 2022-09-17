package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * There are n rings and each ring is either red, green, or blue. The rings are distributed across
 * ten rods labeled from 0 to 9.
 *
 * You are given a string rings of length 2n that describes the n rings that are placed onto
 * the rods. Every two characters in rings forms a color-position pair that is used to
 * describe each ring where:
 *
 * The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
 * The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
 * For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3, a green
 * ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
 *
 * Return the number of rods that have all three colors of rings on them.
 */
class RingsAndRods(private val rings: String) : Solution<Int> {

    override fun getResult(): Int {

        val mapRods = getMapRods()

        for (i in 0 until rings.length - 1 step 2) {

            val symbolColor = rings[i]
            val numberRod = Integer.valueOf(rings[i + 1].toString())
            mapRods[numberRod] =
                mapRods[numberRod]?.replace(getIndexColor(symbolColor), symbolColor)
                    ?: throw IllegalArgumentException()
        }

        return mapRods.filter { el ->
            el.value == "RGB"
        }.size
    }

    private fun getMapRods(): HashMap<Int, String> = hashMapOf(
        0 to "012",
        1 to "012",
        2 to "012",
        3 to "012",
        4 to "012",
        5 to "012",
        6 to "012",
        7 to "012",
        8 to "012",
        9 to "012"
    )

    private fun getIndexColor(symbol: Char): Char =
        when (symbol) {
            'R' -> '0'
            'G' -> '1'
            'B' -> '2'
            else -> throw IllegalArgumentException()
        }
}