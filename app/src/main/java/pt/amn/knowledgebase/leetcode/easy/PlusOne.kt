package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

class PlusOne(private val digits: IntArray) : Solution<IntArray> {
    override fun getResult(): IntArray {

        if(digits.isEmpty()) {
            return intArrayOf()
        }

        var allDigitsIs9 = true
        for (digit in digits) {
            if (digit != 9) {
                allDigitsIs9 = false
                break
            }
        }

        if (allDigitsIs9) {
            val resultArray = IntArray(digits.size+1)
            for ((index, digit) in digits.withIndex()) {
                resultArray[index] = digit
            }

            var digitValue = digits.size-1
            while (resultArray[digitValue] == 9) {
                resultArray[digitValue] = 1
                resultArray[digitValue+1] = 0
                if (digitValue > 0 && digits[digitValue-1] == 9) {
                    digitValue -= 1
                }
            }

            return resultArray
        } else {
            val resultArray = IntArray(digits.size)
            for ((index, digit) in digits.withIndex()) {
                resultArray[index] = digit
            }
            resultArray[digits.size-1] += 1

            var index = digits.size-1
            while (resultArray[index] == 10) {
                resultArray[index] = 0
                resultArray[index-1] += 1
                index--
            }

            return resultArray
        }

    }
}