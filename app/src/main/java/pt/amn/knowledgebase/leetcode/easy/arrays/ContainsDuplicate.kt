package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Если в массиве есть элемент повторяющийся 2 и более раз вернуть true, иначе false.
 */
class ContainsDuplicate(val nums: IntArray) : Solution<Boolean> {
    override fun getResult(): Boolean {
        for((key, value) in nums.groupBy{ it }) {
            if (value.size > 1) return true
        }
        return false

    }
}