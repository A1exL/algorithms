package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaxDepthTest {

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(3);
        TreeNode leftBranch = new TreeNode(9);
        TreeNode rightBranch = new TreeNode(20);
        root.left = leftBranch;
        root.right = rightBranch;


        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        rightBranch.left = fifteen;
        rightBranch.right = seven;

        BinaryTreeMaxDepth sut = new BinaryTreeMaxDepth();
        assertEquals(3, sut.maxDepth(root));
    }

}