package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Дан массив с количество конфет у детей. И число доп. конфет. Вернуть список Boolean,
 * если у ребенка число конфет + доп. конфеты, больше или равно
 * максимальному числу конфет у ребенка, то true.
 */
class KidsWithTheGreatestNumberOfCandies(val candies: IntArray, val extraCandies: Int)
    : Solution<BooleanArray> {

    override fun getResult(): BooleanArray {
        val maxCandies = candies.max() ?: 0
        val result = BooleanArray(candies.size)
        var i = 0;
        for(kid in candies) {
            result[i] = kid + extraCandies >= maxCandies
            i++
        }
        return result
    }
}