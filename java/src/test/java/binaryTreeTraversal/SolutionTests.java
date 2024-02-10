package binaryTreeTraversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.binaryTreeTraversal.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTests {

    TreeNode root;
    Solution solutionTest;
    @BeforeEach
    public void init(){
        solutionTest =  new Solution();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
    }
    @Test
    void testInorderTraversal(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 2, 5, 1, 6, 3, 7));
        List<Integer> actual = solutionTest.inorderTraversal(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPreorderTraversal(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7));
        List<Integer> actual = solutionTest.preorderTraversal(root);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testPostorderTraversal(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1));
        List<Integer> actual = solutionTest.postorderTraversal(root);
        Assertions.assertEquals(expected, actual);
    }
}