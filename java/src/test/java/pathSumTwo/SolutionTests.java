package pathSumTwo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.pathSumTwo.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionTests {

    @Test
    void testPathSum(){
        Solution solutionTest = new Solution();
        // Constructing a sample binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;
        List<List<Integer>> actual = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(11);
        list.add(2);
        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(5);
        actual.add(list);
        actual.add(list2);
        List<List<Integer>> expected = solutionTest.pathSum(root, targetSum);
        System.out.println(expected);
        Assertions.assertEquals(actual, expected);
    }
}
