package kthSmallest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.kthSmallest.Solution;

public class SolutionTests {

    TreeNode root;
    Solution solutionTest;
    @BeforeEach
    public void init(){
        solutionTest =  new Solution();
        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
    }
    @Test
    void testKthSmallest(){
        int k = 3;
        int expected = 3;
        int actual = solutionTest.kthSmallest(root, k);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testKthSmallestTwo(){
        int k = 2;
        int expected = 2;
        int actual = solutionTest.kthSmallest(root, k);
        Assertions.assertEquals(expected, actual);
    }
}
