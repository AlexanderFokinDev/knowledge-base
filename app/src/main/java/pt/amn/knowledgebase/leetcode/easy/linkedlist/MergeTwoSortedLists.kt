package pt.amn.knowledgebase.leetcode.easy.linkedlist

import pt.amn.knowledgebase.leetcode.ListNode
import pt.amn.knowledgebase.leetcode.Solution

class MergeTwoSortedLists(var list1: ListNode?, var list2: ListNode?) : Solution<ListNode?> {
    override fun getResult(): ListNode? {

        var r1 = list1
        var r2 = list2
        val ll = ListNode(0)
        var rr = ll
        while(true){
            if(r1==null && r2==null){
                break
            }
            if(r1==null){
                rr.next = r2
                break
            }
            if(r2==null){
                rr.next = r1
                break
            }
            if(r1.`val`<=r2.`val`){
                rr.next = r1
                r1 = r1.next
            }
            else{
                rr.next = r2
                r2 = r2.next
            }
            rr = rr.next!!
        }
        return ll.next
    }
}