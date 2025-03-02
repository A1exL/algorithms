package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    @Test
    void isBalanced() {
        TreeNode root = getRoot();
        BalancedBinaryTree sut = new BalancedBinaryTree();
        assertTrue(sut.isBalanced(root));
    }

    @Test
    void isBalancedTest2() {
        TreeNode root = new TreeNode(1);
        TreeNode leftBranch = new TreeNode(2);
        TreeNode rightBranch = new TreeNode(2);
        root.left = leftBranch;
        root.right = rightBranch;

        for (int i : new int[]{3, 4, 5}) {
            leftBranch.left = new TreeNode(i);
            leftBranch = leftBranch.left;

            rightBranch.right = new TreeNode(i);
            rightBranch = rightBranch.right;
        }


        BalancedBinaryTree sut = new BalancedBinaryTree();
        assertFalse(sut.isBalanced(root));
    }

    private TreeNode getRoot() {
        TreeNode six = new TreeNode(6);
        TreeNode two = new TreeNode(2);
        TreeNode eight = new TreeNode(8);

        six.left = two;
        six.right = eight;

        TreeNode zero = new TreeNode(0);
        TreeNode four = new TreeNode(4);
        two.left = zero;
        two.right = four;

        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);

        four.left = three;
        four.right = five;

        TreeNode seven = new TreeNode(7);
        TreeNode nine = new TreeNode(9);

        eight.left = seven;
        eight.right = nine;

        return six;
    }
}