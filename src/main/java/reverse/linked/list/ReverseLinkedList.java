package reverse.linked.list;

// https://leetcode.com/problems/reverse-linked-list/
class ReverseLinkedList {

    // 1->2->3->4
    ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode next;
        ListNode current = head;

        while (null != current) {
            next = current.next;
            current.next = previous;  // 1->null;

            previous = current;  //
            current = next;
        }
        return previous;
    }
}
