package pt.amn.knowledgebase.leetcode.medium

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.ListNode

class LinkedListCycleIITest {

    @Test
    fun linkedListCycleIITest1() {
        // Linked list 3, 2, 0, -4
        val l1 = ListNode(3)
        val l2 = ListNode(2)
        l1.next = l2
        val l3 = ListNode(0)
        l2.next = l3
        val l4 = ListNode(-4)
        l3.next = l4
        l4.next = l2

        assertEquals(l2, LinkedListCycleII(l1).getResult())
    }

    @Test
    fun linkedListCycleIITest2() {
        // Linked list 1, 2
        val l1 = ListNode(1)
        val l2 = ListNode(2)
        l1.next = l2
        l2.next = l1

        assertEquals(l1, LinkedListCycleII(l1).getResult())
    }

    @Test
    fun linkedListCycleIITest3() {
        // Linked list 1
        val l1 = ListNode(1)

        assertEquals(null, LinkedListCycleII(l1).getResult())
    }
}