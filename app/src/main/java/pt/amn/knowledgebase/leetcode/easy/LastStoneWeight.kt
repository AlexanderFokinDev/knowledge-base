package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an array of integers stones where stones[i] is the weight of the ith stone.
 *
 * We are playing a game with the stones. On each turn, we choose the heaviest two stones
 * and smash them together. Suppose the heaviest two stones have weights x and y with x <= y.
 * The result of this smash is:
 *
 * If x == y, both stones are destroyed, and
 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
 * At the end of the game, there is at most one stone left.
 *
 * Return the weight of the last remaining stone. If there are no stones left, return 0.
 */
class LastStoneWeight(private val stones: IntArray) : Solution<Int> {

    override fun getResult(): Int {

        if (stones.size == 1) return stones[0]

        stones.sort()
        val mutableList = stones.toMutableList()

        while (mutableList.size > 1) {

            if(mutableList[mutableList.lastIndex] == mutableList[mutableList.lastIndex-1]) {
                mutableList.removeLast()
                mutableList.removeLast()
            } else if (mutableList[mutableList.lastIndex-1] < mutableList[mutableList.lastIndex]) {
                mutableList[mutableList.lastIndex-1] = mutableList[mutableList.lastIndex] - mutableList[mutableList.lastIndex-1]
                mutableList.removeLast()
            }

            mutableList.sort()
        }

        return if(mutableList.size == 0) 0 else mutableList.last()
    }
}