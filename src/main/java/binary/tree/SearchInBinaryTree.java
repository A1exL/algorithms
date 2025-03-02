package binary.tree;

// https://leetcode.com/problems/search-in-a-binary-search-tree/
class SearchInBinaryTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (null == root || root.val == val) return root;

        TreeNode child = val > root.val ? root.right : root.left;
        return searchBST(child, val);
    }
}
