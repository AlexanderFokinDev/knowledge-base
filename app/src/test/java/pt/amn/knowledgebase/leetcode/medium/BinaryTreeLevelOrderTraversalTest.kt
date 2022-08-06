package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.TreeNode

class BinaryTreeLevelOrderTraversalTest {

    @Test
    fun binaryTreeLevelOrderTraversalTest1() {

        val expected = listOf(listOf(3), listOf(9,20), listOf(15,7))

        val l2 = TreeNode(15)
        val r2 = TreeNode(7)

        val l1 = TreeNode(9)
        val r1 = TreeNode(20)
        r1.left = l2
        r1.right = r2

        val tree = TreeNode(3)
        tree.left = l1
        tree.right = r1

        assertArrayEquals(expected.toTypedArray()
            , BinaryTreeLevelOrderTraversal(tree).getResult().toTypedArray())
    }

    @Test
    fun binaryTreeLevelOrderTraversalTest2() {

        val expected = listOf(listOf(1))

        val tree = TreeNode(1)

        assertArrayEquals(expected.toTypedArray()
            , BinaryTreeLevelOrderTraversal(tree).getResult().toTypedArray())
    }

    @Test
    fun binaryTreeLevelOrderTraversalTest3() {

        val expected = listOf<List<Int>>()

        assertArrayEquals(expected.toTypedArray()
            , BinaryTreeLevelOrderTraversal(null).getResult().toTypedArray())
    }
}