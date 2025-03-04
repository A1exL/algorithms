package linked.list.cycle;

import linked.list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        LinkedListCycle sut = new LinkedListCycle();

        ListNode head = ListNode.listNode(1, 2, 3);
        head.next.next.next = head;

        assertTrue(sut.hasCycle(head));
    }
}