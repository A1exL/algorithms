package binary.tree;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
class BinaryTreeMaxDepth {

    public int maxDepth(TreeNode root) {
        if (null == root) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
