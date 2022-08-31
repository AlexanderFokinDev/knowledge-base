package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * There is a hidden integer array arr that consists of n non-negative integers.
 *
 * It was encoded into another integer array encoded of length n - 1, such that
 * encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].
 *
 * You are given the encoded array. You are also given an integer first, that is
 * the first element of arr, i.e. arr[0].
 *
 * Return the original array arr. It can be proved that the answer exists and is unique.
 */
class DecodeXORedArray(private val encoded: IntArray, private val first: Int) : Solution<IntArray> {

    override fun getResult(): IntArray {

        val resultArray = IntArray(encoded.size + 1) {0}

        resultArray[0] = first

        for (index in encoded.indices) {
            resultArray[index+1] = resultArray[index].xor(encoded[index])
        }

        return resultArray
    }
}