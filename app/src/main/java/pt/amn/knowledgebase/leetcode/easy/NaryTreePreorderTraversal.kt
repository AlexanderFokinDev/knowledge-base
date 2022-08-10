package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.Node
import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */
class NaryTreePreorderTraversal(private val root: Node?) : Solution<List<Int>> {

    override fun getResult(): List<Int> {

        return getNodes(root)
    }

    private fun getNodes(head: Node?) : List<Int> {

        val result: MutableList<Int> = mutableListOf()

        if (head != null) {

            result.add(head.`val`)

            for(node in head.children) {
                if (node == null) continue
                result.addAll(getNodes(node))
            }
        }

        return result
    }
}