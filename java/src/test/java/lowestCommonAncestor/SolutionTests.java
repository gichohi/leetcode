package lowestCommonAncestor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.lowestCommonAncestor.Solution;

public class SolutionTests {
    @Test
    void TestLowestCommonAncestor() {
        Solution solutionTest = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = new TreeNode(6);
        TreeNode q = new TreeNode(7);
        int actual = solutionTest.lowestCommonAncestor(root, p, q).val;
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

}
