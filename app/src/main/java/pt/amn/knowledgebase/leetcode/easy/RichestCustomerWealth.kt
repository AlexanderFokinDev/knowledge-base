package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Дан двумерный массив. Посчитать сумму массивов и выявить максимальный из них.
 */
class RichestCustomerWealth(val accounts: Array<IntArray>) : Solution<Int> {
    override fun getResult(): Int {
        var max = 0
        var custSum = 0
        for(customer in accounts) {
            custSum = 0
            for(sum in customer) {
                custSum += sum
            }
            if(custSum > max) max = custSum
        }
        return max

    }
}