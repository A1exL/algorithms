package reverse.linked.list;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        ListNode node = this;
        while (null != node) {
            result.append(node.val).append(' ');
            node = node.next;
        }
        result.append("]");
        return result.toString();
    }
}