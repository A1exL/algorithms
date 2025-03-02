package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SearchInBinaryTreeTest {

    @Test
    void searchBST() {
        SearchInBinaryTree sut = new SearchInBinaryTree();
        assertNull(sut.searchBST(null, 77));


        TreeNode root = new TreeNode(100);
        TreeNode left1 = new TreeNode(50);
        TreeNode right1 = new TreeNode(200);
        root.left = left1;
        root.right = right1;

        TreeNode leftOf50 = new TreeNode(45);
        TreeNode rightOf50 = new TreeNode(60);

        left1.left = leftOf50;
        left1.right = rightOf50;

        TreeNode leftOf200 = new TreeNode(190);
        TreeNode rightOf200 = new TreeNode(210);

        right1.left = leftOf200;
        right1.right = rightOf200;


        assertEquals(leftOf200, sut.searchBST(root, 190));
        assertEquals(rightOf50, sut.searchBST(root, 60));
    }
}