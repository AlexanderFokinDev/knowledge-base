package pt.amn.knowledgebase.leetcode.medium

import pt.amn.knowledgebase.leetcode.ListNode
import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the head of a linked list, return the node where the cycle begins.
 * If there is no cycle, return null.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the next pointer. Internally, pos is used to denote
 * the index of the node that tail's next pointer is connected to (0-indexed).
 * It is -1 if there is no cycle. Note that pos is not passed as a parameter.
 *
 * Do not modify the linked list.
 */
class LinkedListCycleII(private val head: ListNode?) : Solution<ListNode?> {

    override fun getResult(): ListNode? {

        if (head == null || head.next == null) {
            return null
        }

        val mutableSetOfNode: MutableSet<ListNode> = mutableSetOf()

        var curEl: ListNode? = head
        while (curEl != null) {
            if (mutableSetOfNode.contains(curEl.next)) {
                return curEl.next
            }
            mutableSetOfNode.add(curEl)
            curEl = curEl.next
        }

        return null
    }
}