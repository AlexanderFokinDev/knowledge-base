package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 *
 * You can either start from the step with index 0, or the step with index 1.
 *
 * Return the minimum cost to reach the top of the floor.
 */
class MinCostClimbingStairs(private val cost: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        if (cost.isEmpty()) return 0
        if (cost.size == 1) return cost.first()

        val arrData = IntArray(cost.size + 1)
        arrData[0] = cost[0]
        arrData[1] = cost[1]

        for (i in 2..cost.size) {
            val curEl = cost.getOrNull(i) ?: 0
            arrData[i] = minOf(arrData[i-1] + curEl, arrData[i-2] + curEl)
        }

        return arrData.last()
    }
}