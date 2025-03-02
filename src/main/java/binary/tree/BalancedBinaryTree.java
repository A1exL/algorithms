package binary.tree;


// https://leetcode.com/problems/balanced-binary-tree/
class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return balancedDepth(root) >=0;
    }

    // return -1 if un-balanced
    private int balancedDepth(TreeNode node) {
        if (null == node) return 0;

        int leftDepth = balancedDepth(node.left);
        int rightDepth = balancedDepth(node.right);

        if (-1 == leftDepth || -1 == rightDepth || Math.abs(leftDepth - rightDepth) > 1) return -1;

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
