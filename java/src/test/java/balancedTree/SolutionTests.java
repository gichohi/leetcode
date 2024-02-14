package balancedTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.balancedTree.Solution;
import org.leetcode.binaryTree.TreeNode;

public class SolutionTests {

    @Test
    void TestIsBalanced(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solutionTest = new Solution();
        boolean expected = true;
        boolean actual = solutionTest.isBalanced(root);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void TestIsBalancedTwo(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        Solution solutionTest = new Solution();
        boolean expected = false;
        boolean actual = solutionTest.isBalanced(root);
        Assertions.assertEquals(actual, expected);
    }
}
