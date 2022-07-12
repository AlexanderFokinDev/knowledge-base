package pt.amn.knowledgebase.leetcode

class SingleNumber(val nums: IntArray) : Solution<Int> {
    override fun getResult(): Int {
        for((key, value) in nums.groupBy{ it }) {
            if (value.size == 1) return key
        }
        return 0

    }
}