package binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    @Test
    void invertTree() {
        InvertBinaryTree sut = new InvertBinaryTree();

        assertNull(sut.invertTree(null));

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);

        sut.invertTree(node);
        assertEquals(3, node.left.val);
        assertEquals(2, node.right.val);
    }
}