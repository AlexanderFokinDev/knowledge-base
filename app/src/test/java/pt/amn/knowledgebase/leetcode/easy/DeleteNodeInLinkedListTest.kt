package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.ListNode

class DeleteNodeInLinkedListTest {

    @Test
    fun deleteNodeInLinkedList() {

        // Linked list 4, 5, 1, 9
        val l1 = ListNode(4)
        val l2 = ListNode(5)
        l1.next = l2
        val l3 = ListNode(1)
        l2.next = l3
        val l4 = ListNode(9)
        l3.next = l4

        // Solve
        val e1 = ListNode(4)
        val e2 = ListNode(1)
        e1.next = e2
        val e3 = ListNode(9)
        e2.next = e3

        // Lists equal?
        var curEl: ListNode? = e1
        DeleteNodeInLinkedList(l2).getResult()
        var revEl: ListNode? = l1
            do {
            println(curEl?.`val` == revEl?.`val`)
            assertEquals(curEl?.`val`, revEl?.`val`)
            assertTrue((curEl?.next == null && revEl?.next == null)
                    || (curEl?.next != null && revEl?.next != null))
            curEl = curEl?.next
            revEl = revEl?.next

        } while (curEl?.next != null && revEl?.next != null)

    }
}