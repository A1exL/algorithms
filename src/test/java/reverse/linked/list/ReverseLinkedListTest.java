package reverse.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList sut = new ReverseLinkedList();
        assertNull(sut.reverseList(null));
        assertEquals("[ 1 ]", sut.reverseList(listNode(1)).toString());
        assertEquals("[ 3 2 1 ]", sut.reverseList(listNode(1, 2, 3)).toString());
        assertEquals("[ 5 4 3 2 1 ]", sut.reverseList(listNode(1, 2, 3, 4, 5)).toString());
    }

    private ListNode listNode(int... values) {
        ListNode first = null;
        ListNode last = null;
        for (int value : values) {
            ListNode newNode = new ListNode(value);
            if (null == first) {
                first = newNode;
            } else {
                last.next = newNode;
            }
            last = newNode;
        }
        return first;
    }
}