package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution
import kotlin.math.max
import kotlin.math.min

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
class BestTimeToBuyAndSellStock(private val prices: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        if(prices.isEmpty()) return 0

        var maxProfit = 0
        var lowestPrice = prices[0]

        prices.forEach { currentPrice ->
            lowestPrice = min(lowestPrice, currentPrice)
            maxProfit = max(currentPrice - lowestPrice, maxProfit)
        }

        return maxProfit
    }
}