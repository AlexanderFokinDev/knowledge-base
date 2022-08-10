package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.TreeNode

class LowestCommonAncestorOfABinarySearchTreeTest {

    @Test
    fun lowestCommonAncestorOfABinarySearchTreeTest1() {

        val l4 = TreeNode(3)
        val r4 = TreeNode(5)

        val l2 = TreeNode(0)
        val r2 = TreeNode(4)
        r2.left = l4
        r2.right = r4
        val l3 = TreeNode(7)
        val r3 = TreeNode(9)

        val l1 = TreeNode(2)
        l1.left = l2
        l1.right = r2
        val r1 = TreeNode(8)
        r1.left = l3
        r1.right = r3

        val tree = TreeNode(6)
        tree.left = l1
        tree.right = r1

        assertEquals(tree,
            LowestCommonAncestorOfABinarySearchTree(tree, l1, r1)
                .getResult())
    }

    @Test
    fun lowestCommonAncestorOfABinarySearchTreeTest2() {

        val l4 = TreeNode(3)
        val r4 = TreeNode(5)

        val l2 = TreeNode(0)
        val r2 = TreeNode(4)
        r2.left = l4
        r2.right = r4
        val l3 = TreeNode(7)
        val r3 = TreeNode(9)

        val l1 = TreeNode(2)
        l1.left = l2
        l1.right = r2
        val r1 = TreeNode(8)
        r1.left = l3
        r1.right = r3

        val tree = TreeNode(6)
        tree.left = l1
        tree.right = r1

        assertEquals(l1,
            LowestCommonAncestorOfABinarySearchTree(tree, l1, r2)
                .getResult())
    }

    @Test
    fun lowestCommonAncestorOfABinarySearchTreeTest3() {

        val l1 = TreeNode(1)

        val tree = TreeNode(2)
        tree.left = l1

        assertEquals(tree,
            LowestCommonAncestorOfABinarySearchTree(tree, l1, tree)
                .getResult())
    }

    @Test
    fun lowestCommonAncestorOfABinarySearchTreeTest4() {

        val r2 = TreeNode(2)

        val l1 = TreeNode(1)
        l1.right = r2
        val r1 = TreeNode(4)

        val tree = TreeNode(3)
        tree.left = l1
        tree.right = r1

        assertEquals(tree,
            LowestCommonAncestorOfABinarySearchTree(tree, r2, r1)
                .getResult())
    }

    @Test
    fun lowestCommonAncestorOfABinarySearchTreeTest5() {

        val l4 = TreeNode(3)
        val r4 = TreeNode(5)

        val l2 = TreeNode(0)
        val r2 = TreeNode(4)
        r2.left = l4
        r2.right = r4
        val l3 = TreeNode(7)
        val r3 = TreeNode(9)

        val l1 = TreeNode(2)
        l1.left = l2
        l1.right = r2
        val r1 = TreeNode(8)
        r1.left = l3
        r1.right = r3

        val tree = TreeNode(6)
        tree.left = l1
        tree.right = r1

        assertEquals(r2,
            LowestCommonAncestorOfABinarySearchTree(tree, l4, r4)
                .getResult())
    }
}