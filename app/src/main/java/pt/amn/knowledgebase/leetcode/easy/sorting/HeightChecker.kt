package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * A school is trying to take an annual photo of all the students. The students are asked to stand
 * in a single file line in non-decreasing order by height. Let this ordering be represented by the
 * integer array expected where expected[i] is the expected height of the ith student in line.
 *
 * You are given an integer array heights representing the current order that the students are
 * standing in. Each heights[i] is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 */
class HeightChecker(private val heights: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        var countDistinct = 0

        val expected = heights.clone()
        expected.sort()

        for (index in heights.indices) {
            if (expected[index] != heights[index]) countDistinct++
        }

        return countDistinct
    }
}