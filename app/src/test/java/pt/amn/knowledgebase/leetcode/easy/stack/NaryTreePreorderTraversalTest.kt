package pt.amn.knowledgebase.leetcode.easy.stack

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.Node

class NaryTreePreorderTraversalTest {

    @Test
    fun naryTreePreorderTraversalTest1() {

        val expNodeHead = Node(1)
        val expChild1 = Node(3)
        val expChild2 = Node(2)
        val expChild3 = Node(4)
        expNodeHead.children = listOf(null, expChild1, expChild2, expChild3)

        val expChild4 = Node(5)
        val expChild5 = Node(6)
        expChild1.children = listOf(null, expChild4, expChild5)

        assertArrayEquals(
            listOf(1, 3, 5, 6, 2, 4).toIntArray(),
            NaryTreePreorderTraversal(expNodeHead).getResult().toIntArray()
        )
    }

    @Test
    fun naryTreePreorderTraversalTest2() {

        val expNodeHead = Node(1)
        val expChild1 = Node(2)
        expChild1.children = listOf(null)
        val expChild2 = Node(3)
        val expChild3 = Node(4)
        val expChild4 = Node(5)
        expNodeHead.children = listOf(null, expChild1, expChild2, expChild3, expChild4)

        val expChild5 = Node(6)
        expChild5.children = listOf(null)
        val expChild6 = Node(7)
        val expChild611 = Node(14)
        expChild611.children = listOf(null)
        val expChild61 = Node(11)
        expChild61.children = listOf(null,expChild611)
        expChild6.children = listOf(null,expChild61)
        expChild2.children = listOf(null, expChild5, expChild6)

        val expChild7 = Node(8)
        val expChild71 = Node(12)
        expChild71.children = listOf(null)
        expChild7.children = listOf(null,expChild71)
        expChild3.children = listOf(null, expChild7)

        val expChild8 = Node(9)
        val expChild81 = Node(13)
        expChild81.children = listOf(null)
        expChild8.children = listOf(null,expChild81)
        val expChild9 = Node(10)
        expChild9.children = listOf(null)
        expChild4.children = listOf(null, expChild8, expChild9)

        assertArrayEquals(
            listOf(1,2,3,6,7,11,14,4,8,12,5,9,13,10).toIntArray(),
            NaryTreePreorderTraversal(expNodeHead).getResult().toIntArray()
        )
    }
}