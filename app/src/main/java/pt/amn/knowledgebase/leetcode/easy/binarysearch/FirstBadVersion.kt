package pt.amn.knowledgebase.leetcode.easy.binarysearch

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 */
class FirstBadVersion(private val n: Int, private val badInputVersion: Int) : Solution<Int> {

    override fun getResult(): Int {

        var startRange = 1
        var endRange = n
        var badVersion = -1

        while (true) {

            val middle = if (startRange == endRange) startRange
            else (startRange/2 + endRange/2)

            if(isBadVersion(middle)) {
                endRange = middle
                badVersion = middle
                if(startRange == middle) break
            } else {
                if(startRange == middle) startRange++
                else startRange = middle
            }

        }

        return badVersion
    }

    fun isBadVersion(version: Int) : Boolean {
        return version >= badInputVersion
    }
}