package pt.amn.knowledgebase.leetcode.easy.dynamic_programming

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 */
class CountingBits(private val n: Int) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val ans = IntArray(n + 1) { 0 }

        for (index in ans.indices) {
            ans[index] = Integer.toBinaryString(index)
                .filter { num ->
                    num == '1'
                }.length
        }

        return ans

    }
}