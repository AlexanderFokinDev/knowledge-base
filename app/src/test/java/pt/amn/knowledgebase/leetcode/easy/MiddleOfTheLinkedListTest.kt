package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.ListNode

class MiddleOfTheLinkedListTest {

    @Test
    fun middleOfTheLinkedListTest1() {

        // Linked list 1, 2, 3, 4, 5
        val l1 = ListNode(1)
        val l2 = ListNode(2)
        l1.next = l2
        val l3 = ListNode(3)
        l2.next = l3
        val l4 = ListNode(4)
        l3.next = l4
        val l5 = ListNode(5)
        l4.next = l5

        assertEquals(l3, MiddleOfTheLinkedList(l1).getResult())
    }

    @Test
    fun middleOfTheLinkedListTest2() {

        // Linked list 1, 2, 3, 4, 5, 6
        val l1 = ListNode(1)
        val l2 = ListNode(2)
        l1.next = l2
        val l3 = ListNode(3)
        l2.next = l3
        val l4 = ListNode(4)
        l3.next = l4
        val l5 = ListNode(5)
        l4.next = l5
        val l6 = ListNode(6)
        l5.next = l6

        assertEquals(l4, MiddleOfTheLinkedList(l1).getResult())
    }
}