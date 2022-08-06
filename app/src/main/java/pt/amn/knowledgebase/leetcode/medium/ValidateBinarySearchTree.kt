package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.Solution
import pt.amn.knowledgebase.leetcode.TreeNode

/**
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 *
 * A valid BST is defined as follows:
 *
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 */
class ValidateBinarySearchTree(private val root: TreeNode?) : Solution<Boolean> {

    override fun getResult(): Boolean {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE)
    }

    private fun helper(node: TreeNode?, min: Long, max: Long): Boolean {
        if(node == null) return true
        if(node.`val` <= min || node.`val` >= max) return false
        return helper(node.left, min, node.`val`.toLong()) && helper(node.right, node.`val`.toLong(), max)
    }
}