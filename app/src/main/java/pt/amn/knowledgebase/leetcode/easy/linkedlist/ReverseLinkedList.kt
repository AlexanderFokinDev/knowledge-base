package pt.amn.knowledgebase.leetcode.easy.linkedlist

import pt.amn.knowledgebase.leetcode.ListNode
import pt.amn.knowledgebase.leetcode.Solution

class ReverseLinkedList(private val head: ListNode?) : Solution<ListNode?> {
    override fun getResult(): ListNode? {

        var lastNode : ListNode? = head
        var newList : ListNode? = null
        var prevNode : ListNode? = null
        while (lastNode != null) {
            newList = lastNode
            lastNode = lastNode.next
            newList.next = prevNode
            prevNode = newList
        }

        return newList

    }
}