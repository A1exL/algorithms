package linked.list.middle;

import linked.list.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleLinkedListTest {

    @Test
    void middleNode() {
        MiddleLinkedList sut = new MiddleLinkedList();

        assertEquals(3, sut.middleNode(ListNode.listNode(1, 2, 3, 4, 5)).val);
        assertEquals(4, sut.middleNode(ListNode.listNode(1, 2, 3, 4, 5, 6)).val);
    }
}