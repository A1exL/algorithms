package linked.list.cycle;

import linked.list.ListNode;

// https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean result = false;
        if (null == head) return false;

        ListNode slow = next(head);
        ListNode fast = next(next(head));
        while (null != slow && null != fast) {
            if (slow == fast) {
                result = true;
                break;
            }
            slow = next(slow);
            fast = next(next(fast));
        }
        return result;
    }

    private ListNode next(ListNode node) {
        return null != node ? node.next : null;
    }
}
