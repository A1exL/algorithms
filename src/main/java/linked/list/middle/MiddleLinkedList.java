package linked.list.middle;

import linked.list.ListNode;

// https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        if (null == head || null == head.next) return head;

        ListNode slow = head;
        ListNode fast = head;

        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
