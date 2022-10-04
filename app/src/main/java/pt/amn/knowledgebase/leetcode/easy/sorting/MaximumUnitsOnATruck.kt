package pt.amn.knowledgebase.leetcode.easy.sorting

import pt.amn.knowledgebase.leetcode.Solution

/**
 * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes,
 * where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
 *
 * numberOfBoxesi is the number of boxes of type i.
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put
 * on the truck. You can choose any boxes to put on the truck as long as the number
 * of boxes does not exceed truckSize.
 *
 * Return the maximum total number of units that can be put on the truck.
 */
class MaximumUnitsOnATruck(private val boxTypes: Array<IntArray>, private val truckSize: Int) :
    Solution<Int> {

    override fun getResult(): Int {

        var countUnits = 0
        var availableSize = truckSize

        boxTypes.sortedByDescending { item ->
            item[1]
        }.forEach { boxType ->
            if (availableSize >= boxType[0]) {
                countUnits += boxType[0] * boxType[1]
                availableSize -= boxType[0]
            } else {
                countUnits += availableSize * boxType[1]
                availableSize = 0
                return countUnits
            }
        }

        return countUnits
    }
}