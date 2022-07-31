package pt.amn.knowledgebase.leetcode.easy

import pt.amn.knowledgebase.leetcode.ListNode
import pt.amn.knowledgebase.leetcode.Solution

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */
class MiddleOfTheLinkedList(private val head: ListNode?) : Solution<ListNode?> {

    override fun getResult(): ListNode? {

        val nodes = mutableListOf<ListNode>()
        var curEl = head

        var index = 0
        while (curEl != null) {
            nodes.add(curEl)
            index++
            curEl = curEl.next
        }

        return nodes[index / 2]
    }
}