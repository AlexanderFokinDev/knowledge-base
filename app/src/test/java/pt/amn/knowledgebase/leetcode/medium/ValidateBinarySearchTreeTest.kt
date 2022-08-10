package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.TreeNode

class ValidateBinarySearchTreeTest {

    @Test
    fun validateBinarySearchTreeTest1() {

        val l1 = TreeNode(1)
        val r1 = TreeNode(3)

        val tree = TreeNode(2)
        tree.left = l1
        tree.right = r1

        assertEquals(true, ValidateBinarySearchTree(tree).getResult())
    }

    @Test
    fun validateBinarySearchTreeTest2() {

        val l2 = TreeNode(3)
        val r2 = TreeNode(6)

        val l1 = TreeNode(1)
        val r1 = TreeNode(4)
        r1.left = l2
        r1.right = r2

        val tree = TreeNode(5)
        tree.left = l1
        tree.right = r1

        assertEquals(false, ValidateBinarySearchTree(tree).getResult())
    }

    @Test
    fun validateBinarySearchTreeTest3() {

        val l2 = TreeNode(3)
        val r2 = TreeNode(7)

        val l1 = TreeNode(4)
        val r1 = TreeNode(6)
        r1.left = l2
        r1.right = r2

        val tree = TreeNode(5)
        tree.left = l1
        tree.right = r1

        assertEquals(false, ValidateBinarySearchTree(tree).getResult())
    }

    @Test
    fun validateBinarySearchTreeTest4() {

        val l2 = TreeNode(0)
        val r2 = TreeNode(2)

        val l3 = TreeNode(4)
        val r3 = TreeNode(6)

        val l1 = TreeNode(1)
        l1.left = l2
        l1.right = r2
        val r1 = TreeNode(5)
        r1.left = l3
        r1.right = r3

        val tree = TreeNode(3)
        tree.left = l1
        tree.right = r1

        assertEquals(true, ValidateBinarySearchTree(tree).getResult())
    }

    @Test
    fun validateBinarySearchTreeTest5() {

        val l2 = TreeNode(19)

        val r4 = TreeNode(27)

        val r3 = TreeNode(56)
        r3.right = r4

        val l1 = TreeNode(26)
        l1.left = l2
        val r1 = TreeNode(47)
        r1.right = r3

        val tree = TreeNode(32)
        tree.left = l1
        tree.right = r1

        assertEquals(false, ValidateBinarySearchTree(tree).getResult())
    }

    @Test
    fun validateBinarySearchTreeTest6() {

        val r4 = TreeNode(3)

        val l2 = TreeNode(0)
        val r2 = TreeNode(2)
        r2.right = r4

        val l3 = TreeNode(4)
        val r3 = TreeNode(6)

        val l1 = TreeNode(1)
        l1.left = l2
        l1.right = r2
        val r1 = TreeNode(5)
        r1.left = l3
        r1.right = r3

        val tree = TreeNode(3)
        tree.left = l1
        tree.right = r1

        assertEquals(false, ValidateBinarySearchTree(tree).getResult())
    }
}