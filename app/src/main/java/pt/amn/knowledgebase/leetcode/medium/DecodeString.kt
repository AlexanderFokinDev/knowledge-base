package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square
 * brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces,
 * square brackets are well-formed, etc. Furthermore, you may assume that the original data
 * does not contain any digits and that digits are only for those repeat numbers, k.
 * For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 */
class DecodeString(private val s: String) : Solution<String> {

    override fun getResult(): String {

        return getMutableListFromString(s)
    }

    private fun getMutableListFromString(
        str: String
    ) : String {

        val mutableList = mutableListOf<ClosedString>()

        var index = 0
        while (index < str.length) {
            if(str[index].isLetter()) {
                mutableList.add(ClosedString(1, str[index].toString()))
                index++
            } else if (str[index].isDigit()) {
                val digit = getDigitFromString(str.substring(index))

                val subStr = getSubstring(digit, str.substring(index))
                val innerString = getMutableListFromString(subStr)

                var multiplyStr = ""
                for (i in 1..digit) {
                    multiplyStr += innerString
                }

                mutableList.add(ClosedString(1, multiplyStr))
                index += digit.toString().length + 2 + subStr.length
            } else {
                index++
            }
        }

        return mutableListToString(mutableList)
    }

    private fun mutableListToString(mutList: MutableList<ClosedString>) : String {

        var decodeString = ""
        for (el in mutList) {
            for (i in 1..el.number) {
                decodeString += el.closeString
            }
        }

        return decodeString
    }

    private fun getDigitFromString(substring: String) : Int {
        var num = ""
        var index = 0
        while (substring[index] != '[') {
            num += substring[index]
            index++
        }
        return num.toInt()
    }

    private fun getSubstring(digit: Int, substring: String) : String {

        val startParenthess = digit.toString().length
        var endParenthess = substring.length-1
        var countParenthess = 1

        for (symb in startParenthess+1 until substring.length) {
            if (substring[symb] == ']' && countParenthess == 1) {
                endParenthess = symb
                break
            } else if (substring[symb] == '[') {
                countParenthess++
            } else if (substring[symb] == ']') {
                countParenthess--
            }
        }

        return substring.substring(startParenthess+1, endParenthess)
    }

    data class ClosedString(val number: Int, val closeString: String)
}