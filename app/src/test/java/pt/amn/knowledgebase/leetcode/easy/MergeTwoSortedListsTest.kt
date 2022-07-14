package pt.amn.knowledgebase.leetcode.easy

import org.junit.Assert.*
import org.junit.Test
import pt.amn.knowledgebase.leetcode.ListNode

class MergeTwoSortedListsTest {

    @Test
    fun mergeTwoSortedLists() {
        // First linked list 1, 2, 4
        val l1 = ListNode(1)
        val l2 = ListNode(2)
        l1.next = l2
        val l3 = ListNode(4)
        l2.next = l3

        // Second linked list 1, 3, 4
        val p1 = ListNode(1)
        val p2 = ListNode(3)
        p1.next = p2
        val p3 = ListNode(4)
        p2.next = p3

        // Solve
        val e1 = ListNode(1)
        val e2 = ListNode(1)
        e1.next = e2
        val e3 = ListNode(2)
        e2.next = e3
        val e4 = ListNode(3)
        e3.next = e4
        val e5 = ListNode(4)
        e4.next = e5
        val e6 = ListNode(4)
        e5.next = e6
        val mergedList = MergeTwoSortedLists(l1, p1)

        // Lists equal?
        var curEl: ListNode? = e1
        var merEl: ListNode? = mergedList.getResult()
        do {
            println(curEl?.`val` == merEl?.`val`)
            assertEquals(curEl?.`val`, merEl?.`val`)
            assertTrue((curEl?.next == null && merEl?.next == null)
                    || (curEl?.next != null && merEl?.next != null))
            curEl = curEl?.next
            merEl = merEl?.next

        } while (curEl?.next != null && merEl?.next != null)
    }
}