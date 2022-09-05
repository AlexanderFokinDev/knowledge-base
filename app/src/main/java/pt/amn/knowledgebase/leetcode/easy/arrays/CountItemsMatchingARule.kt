package pt.amn.knowledgebase.leetcode.easy.arrays

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
 * color, and name of the ith item. You are also given a rule represented by two strings,
 * ruleKey and ruleValue.
 *
 * The ith item is said to match the rule if one of the following is true:
 *
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 */
class CountItemsMatchingARule(
    private val items: List<List<String>>,
    private val ruleKey: String,
    private val ruleValue: String
) : Solution<Int> {

    override fun getResult(): Int {

        var result = 0

        val indexValue = when(ruleKey) {
            "type" -> 0
            "color" -> 1
            "name" -> 2
            else -> return 0
        }

        for (item in items) {
            if(item[indexValue] == ruleValue) result++
        }

        return result
    }
}