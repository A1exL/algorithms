package linked.list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode listNode(int... values) {
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        ListNode node = this;
        while (null != node && result.length() < 512) {
            result.append(node.val).append(' ');
            node = node.next;
        }
        result.append("]");
        return result.toString();
    }


}