package merge.two.sorted.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        MergeTwoSortedLists sut = new MergeTwoSortedLists();
        ListNode result = sut.mergeTwoLists(listNode(-10,-9,-6,-4,1,9,9), listNode(-5,-3,0,7,8,8));
        assertEquals("[ -10 -9 -6 -5 -4 -3 0 1 7 8 8 9 9 ]", result.toString());
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