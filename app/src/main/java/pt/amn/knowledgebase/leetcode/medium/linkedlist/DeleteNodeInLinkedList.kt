package pt.amn.knowledgebase.leetcode.medium.linkedlist

import pt.amn.knowledgebase.leetcode.ListNode
import pt.amn.knowledgebase.leetcode.Solution

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class DeleteNodeInLinkedList(val node: ListNode?) : Solution<Unit> {
    override fun getResult() {
        node?.`val` = node?.next?.`val` ?: 0
        node?.next = node?.next?.next
    }
}