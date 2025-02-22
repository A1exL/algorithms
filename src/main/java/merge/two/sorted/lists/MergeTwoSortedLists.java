package merge.two.sorted.lists;

// https://leetcode.com/problems/merge-two-sorted-lists/
class MergeTwoSortedLists {

    // [1, 2, 4], [1, 3, 4] -> [1, 1, 2, 3, 4]
    // [1, 2, 4], [3, 5] -> [1, 2, 3, 4, 5]
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultHead = new ListNode();
        ListNode result = resultHead;

        while (null != list1 && null != list2) {
            if (list1.val < list2.val) {
                result.next = list1;
                list1 = list1.next;
            } else {
                result.next = list2;
                list2 = list2.next;
            }
            result = result.next;
        }
        if (null != list1) {
            result.next = list1;
        } else if (null != list2) {
            result.next = list2;
        }

        return resultHead.next;
    }

}


