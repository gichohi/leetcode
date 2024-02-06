package diameterBinaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.diameterBinaryTree.Solution;
import org.leetcode.binaryTree.TreeNode;

public class SolutionTests {

    @Test
    void testDiameterOfBinaryTree(){
        Solution solutionTest = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int expected = 3;
        int actual = solutionTest.diameterOfBinaryTree(root);
        Assertions.assertEquals(actual, expected);
    }
}
