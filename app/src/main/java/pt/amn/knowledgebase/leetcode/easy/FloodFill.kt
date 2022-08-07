package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Solution

/**
 * An image is represented by an m x n integer grid image where image[i][j]
 * represents the pixel value of the image.
 *
 * You are also given three integers sr, sc, and color. You should perform a flood fill
 * on the image starting from the pixel image[sr][sc].
 *
 * To perform a flood fill, consider the starting pixel, plus any pixels connected
 * 4-directionally to the starting pixel of the same color as the starting pixel,
 * plus any pixels connected 4-directionally to those pixels (also with the same color),
 * and so on. Replace the color of all of the aforementioned pixels with color.
 *
 * Return the modified image after performing the flood fill.
 */
class FloodFill(
    private val image: Array<IntArray>,
    private val sr: Int,
    private val sc: Int,
    private val color: Int
) : Solution<Array<IntArray>> {

    var resultArray: Array<IntArray> = image
    var changedColor = 0

    override fun getResult(): Array<IntArray> {

        fillCross(sr, sc, color, true)

        return resultArray
    }

    private fun fillCross(i: Int, j: Int, color: Int, firstPoint: Boolean = false) {

        if (!fillItem(i, j, color, firstPoint)) return

        fillCross(i - 1, j, color)
        fillCross(i + 1, j, color)
        fillCross(i, j - 1, color)
        fillCross(i, j + 1, color)
    }

    private fun fillItem(i: Int, j: Int, color: Int, firstPoint: Boolean = false): Boolean {

        if (
            i < 0 || j < 0
            || i >= resultArray.size || j >= resultArray[0].size) return false

        if(firstPoint) changedColor = resultArray[i][j]

        if (
            ((resultArray[i][j] != changedColor || (resultArray[i][j] == color)) && !firstPoint)
        ) {
            return false
        }

        resultArray[i][j] = color
        return true
    }
}