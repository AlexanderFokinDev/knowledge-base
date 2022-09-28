package pt.amn.knowledgebase.leetcode.easy.hashtable

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are given an array of strings names, and an array heights that consists of distinct
 * positive integers. Both arrays are of length n.
 *
 * For each index i, names[i] and heights[i] denote the name and height of the ith person.
 *
 * Return names sorted in descending order by the people's heights.
 */
class SortThePeople(private val names: Array<String>, private val heights: IntArray) :
    Solution<Array<String>> {

    override fun getResult(): Array<String> {

        val mapPeople = hashMapOf<Int, String>()
        val sortedArray = Array<String>(names.size) {""}

        for ((index, height) in heights.withIndex()) {
            mapPeople.put(height, names[index])
        }

        heights.sortDescending()
        for((index, sortedHeight) in heights.withIndex()) {
            sortedArray[index] = mapPeople.getOrDefault(sortedHeight, "")
        }

        return sortedArray
    }
}