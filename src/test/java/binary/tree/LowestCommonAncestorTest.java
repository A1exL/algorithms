package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LowestCommonAncestorTest {

    @Test
    void lowestCommonAncestor() {
        LowestCommonAncestor sut = new LowestCommonAncestor();

        TreeNode root = getRoot();

        TreeNode treeNode = sut.lowestCommonAncestor(root, new TreeNode(5), new TreeNode(3));
        assertEquals(4, treeNode.val);
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