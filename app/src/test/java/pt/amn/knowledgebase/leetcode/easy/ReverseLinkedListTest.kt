package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.ListNode

class ReverseLinkedListTest {

    @Test
    fun reverseLinkedList() {

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

        // Solve
        val e1 = ListNode(5)
        val e2 = ListNode(4)
        e1.next = e2
        val e3 = ListNode(3)
        e2.next = e3
        val e4 = ListNode(2)
        e3.next = e4
        val e5 = ListNode(1)
        e4.next = e5
        val reversedList = ReverseLinkedList(l1)

        // Lists equal?
        var curEl: ListNode? = e1
        var revEl: ListNode? = reversedList.getResult()
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