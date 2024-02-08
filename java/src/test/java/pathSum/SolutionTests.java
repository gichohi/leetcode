package pathSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.pathSum.Solution;

public class SolutionTests {

    @Test
    void TestHasPathSum(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        Solution solution = new Solution();

        boolean expected= true;
        boolean actual = solution.hasPathSum(root, targetSum);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void TestHasPathSum2(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int targetSum = 5;

        Solution solution = new Solution();

        boolean expected= false;
        boolean actual = solution.hasPathSum(root, targetSum);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void TestHasPathSum3(){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);

        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.right.right = new TreeNode(1);

        int targetSum = 17;

        Solution solution = new Solution();

        boolean expected= true;
        boolean actual = solution.hasPathSum(root, targetSum);
        Assertions.assertEquals(expected, actual);

    }

}
