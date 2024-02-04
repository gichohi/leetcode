package org.leetcode.deletemiddlenode;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = new ListNode();
        prev.next = slow;

        while (fast != null && fast.next != null){
            prev.next = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next.next = slow.next;

        return head;
    }
}
