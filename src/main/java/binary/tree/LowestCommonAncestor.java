package binary.tree;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) return null;

        TreeNode max = p.val > q.val ? p : q;
        TreeNode min = p.val < q.val ? p : q;

        if (min.val <= root.val && max.val >= root.val) {
            return root; // found it
        }
        //               both p,q are less
        TreeNode child = max.val < root.val ? root.left : root.right;
        return lowestCommonAncestor(child, p, q);
    }
}
