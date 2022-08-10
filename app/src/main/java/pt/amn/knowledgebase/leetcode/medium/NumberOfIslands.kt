package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water),
 * return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally
 * or vertically. You may assume all four edges of the grid are all surrounded by water.
 */
class NumberOfIslands(private val grid: Array<CharArray>) : Solution<Int> {

    private var usedCell = mutableMapOf<String, Boolean>()
    private var countOfIslands = 0

    override fun getResult(): Int {

        for (row in grid.indices) {

            for (column in grid[row].indices) {

                if (usedCell.getOrDefault("$row $column", false)) continue

                if (checkCell(row, column, false)) {
                    countOfIslands++
                }

            }

        }

        return countOfIslands
    }

    private fun checkCell(row: Int, column: Int, foundIsland: Boolean) : Boolean {

        var isIsland = foundIsland
        val center = checkNearCell(row, column)
        if (center == CellType.ISLAND) {
            isIsland = true
        }

        // Check cells around
        if (checkNearCell(row, column-1) == CellType.ISLAND) {
            isIsland = true
            checkCell(row, column-1, isIsland)
            if (center == CellType.EMPTY) return isIsland
        }

        if (checkNearCell(row-1, column) == CellType.ISLAND) {
            isIsland = true
            checkCell(row-1, column, isIsland)
            if (center == CellType.EMPTY) return isIsland
        }

        if (checkNearCell(row, column+1) == CellType.ISLAND) {
            isIsland = true
            checkCell(row, column+1, isIsland)
            if (center == CellType.EMPTY) return isIsland
        }

        if (checkNearCell(row+1, column) == CellType.ISLAND) {
            isIsland = true
            checkCell(row+1, column, isIsland)
        }

        return isIsland

    }

    private fun checkNearCell(row: Int, column: Int) : CellType {

        val cellType = if (row < 0 || column < 0 || row >= grid.size || column >= grid[0].size) {
            return CellType.BEYOND
        } else if (usedCell.getOrDefault("$row $column", false)) {
            return CellType.USED
        } else if (grid[row][column] == '0') {
            CellType.EMPTY
        } else {
            CellType.ISLAND
        }

        usedCell.put("$row $column", true)

        return cellType
    }


    enum class CellType {
        USED,
        BEYOND,
        EMPTY,
        ISLAND
    }
}