package binary.tree;

import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/diameter-of-binary-tree/
class DiameterBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        AtomicInteger result = new AtomicInteger();

        nodeDepth(root, result);
        return result.get();
    }

    private int nodeDepth(TreeNode node, AtomicInteger maxDiameter) {
        if (null == node) return 0;

        int leftDepth = nodeDepth(node.left, maxDiameter);
        int rightDepth = nodeDepth(node.right, maxDiameter);

        maxDiameter.set(Math.max(maxDiameter.get(), leftDepth + rightDepth));

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
