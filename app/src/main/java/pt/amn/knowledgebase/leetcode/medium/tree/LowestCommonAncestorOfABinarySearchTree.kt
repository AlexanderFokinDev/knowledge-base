package pt.amn.knowledgebase.leetcode.medium.tree

import pt.amn.knowledgebase.leetcode.Solution
import pt.amn.knowledgebase.leetcode.TreeNode

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA)
 * node of two given nodes in the BST.
 *
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor
 * is defined between two nodes p and q as the lowest node in T that has both
 * p and q as descendants (where we allow a node to be a descendant of itself).”
 */
class LowestCommonAncestorOfABinarySearchTree(
    private val root: TreeNode?,
    private val p: TreeNode?,
    private val q: TreeNode?
) : Solution<TreeNode?> {

    override fun getResult(): TreeNode? {

        if (root == null || p == null || q == null) {
            return null
        }

        val ancestors: MutableList<Inhetitance> = mutableListOf()
        ancestors.add(Inhetitance(root, null, 0))
        ancestors.addAll(getAncestorsList(ancestors[0]))

        var lineP = ancestors.find { inhetitance ->
            inhetitance.node == p
        }

        var lineQ = ancestors.find { inhetitance ->
            inhetitance.node == q
        }

        val arrayAncestorsP: MutableList<TreeNode?> = getAncestors(lineP)
        val arrayAncestorsQ: MutableList<TreeNode?> = getAncestors(lineQ)

        if ((lineP?.deep ?: 0) < (lineQ?.deep ?: 0)) {

            while (lineP?.node != null) {
                val findedNode = arrayAncestorsQ.find { treeNode -> treeNode == lineP?.node }
                if (findedNode != null) {
                    return findedNode
                } else {
                    lineP = lineP?.father
                }
            }

        } else {

            while (lineQ?.node != null) {
                val findedNode = arrayAncestorsP.find { treeNode -> treeNode == lineQ?.node }
                if (findedNode != null) {
                    return findedNode
                } else {
                    lineQ = lineQ?.father
                }
            }
        }

        return null

    }

    private fun getAncestors(ancestor: Inhetitance?): MutableList<TreeNode?> {

        val arrayAncestors: MutableList<TreeNode?> = mutableListOf()

        if (ancestor?.node != null) {
            arrayAncestors.add(ancestor.node)
            arrayAncestors.addAll(getAncestors(ancestor.father))
        }

        return arrayAncestors
    }

    private fun getAncestorsList(ancestor: Inhetitance): List<Inhetitance> {

        val list: MutableList<Inhetitance> = mutableListOf()
        val deep = ancestor.deep + 1

        if (ancestor.node != null) {

            if (ancestor.node.left != null) {
                val head = Inhetitance(ancestor.node.left, ancestor, deep)
                list.add(head)
                list.addAll(getAncestorsList(head))
            }

            if (ancestor.node.right != null) {
                val head = Inhetitance(ancestor.node.right, ancestor, deep)
                list.add(head)
                list.addAll(getAncestorsList(head))
            }
        }

        return list
    }

    data class Inhetitance(val node: TreeNode?, val father: Inhetitance?, val deep: Int)
}