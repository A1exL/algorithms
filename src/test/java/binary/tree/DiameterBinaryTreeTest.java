package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiameterBinaryTreeTest {

    @Test
    void diameterOfBinaryTree() {
        TreeNode root = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        root.left = two;
        root.right = three;

        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);

        two.left = four;
        two.right = five;

        DiameterBinaryTree sut = new DiameterBinaryTree();
        assertEquals(3, sut.diameterOfBinaryTree(root));
    }
}