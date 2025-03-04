package linked.list.merge;

import linked.list.ListNode;
import org.junit.jupiter.api.Test;

import static linked.list.ListNode.listNode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists sut = new MergeTwoSortedLists();
        ListNode result1 = sut.mergeTwoLists(listNode(-10,-9,-6,-4,1,9,9), listNode(-5,-3,0,7,8,8));
        assertEquals("[ -10 -9 -6 -5 -4 -3 0 1 7 8 8 9 9 ]", result1.toString());

        ListNode result2 = sut.mergeTwoLists(listNode(1, 2, 4), listNode(1, 3, 5));
        assertEquals("[ 1 1 2 3 4 5 ]", result2.toString());

        ListNode result3 = sut.mergeTwoLists(listNode(1, 2, 4), listNode(3, 5));
        assertEquals("[ 1 2 3 4 5 ]", result3.toString());
    }

}