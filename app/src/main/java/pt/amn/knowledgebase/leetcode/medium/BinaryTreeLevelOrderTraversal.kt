package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution
import pt.amn.knowledgebase.leetcode.TreeNode

/**
 * Given the root of a binary tree, return the level order traversal
 * of its nodes' values. (i.e., from left to right, level by level).
 */
class BinaryTreeLevelOrderTraversal(private val root: TreeNode?) : Solution<List<List<Int>>> {

    override fun getResult(): List<List<Int>> {

        val result : MutableList<List<Int>> = mutableListOf()

        if (root != null) {
            val ancestors : MutableList<Inhetitance> = mutableListOf()
            ancestors.add(Inhetitance(root, null, 0))
            ancestors.addAll(getAncestorsList(ancestors[0]))

            val deepMap = ancestors.groupBy{ it.deep }

            for (level in deepMap) {
                val listInt = level.value.map { it ->
                    it.node?.`val` ?: 0
                }
                result.add(listInt)
            }
        }

        return result
    }

    private fun getAncestorsList(ancestor: Inhetitance): List<Inhetitance> {

        val list: MutableList<Inhetitance> = mutableListOf()
        val deep = ancestor.deep + 1

        if (ancestor.node != null) {

            if (ancestor.node.left != null) {
                val head = Inhetitance(
                    ancestor.node.left,
                    ancestor,
                    deep
                )
                list.add(head)
                list.addAll(getAncestorsList(head))
            }

            if (ancestor.node.right != null) {
                val head = Inhetitance(
                    ancestor.node.right,
                    ancestor,
                    deep
                )
                list.add(head)
                list.addAll(getAncestorsList(head))
            }
        }

        return list
    }

    data class Inhetitance(val node: TreeNode?, val father: Inhetitance?, val deep: Int)
}