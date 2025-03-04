package linked.list.reverse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static linked.list.ListNode.listNode;


class ReverseLinkedListTest {

    @Test
    void reverseList() {
        ReverseLinkedList sut = new ReverseLinkedList();
        Assertions.assertNull(sut.reverseList(null));
        Assertions.assertEquals("[ 1 ]", sut.reverseList(listNode(1)).toString());
        Assertions.assertEquals("[ 3 2 1 ]", sut.reverseList(listNode(1, 2, 3)).toString());
        Assertions.assertEquals("[ 5 4 3 2 1 ]", sut.reverseList(listNode(1, 2, 3, 4, 5)).toString());
    }


}