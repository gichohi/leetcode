package levelOrderTraversal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.binaryTree.TreeNode;
import org.leetcode.levelOrderTraversal.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionTests {

    @Test
    void testLevelOrder(){
        Solution solutionTest = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(3);
        List<Integer> two = new ArrayList<>();
        two.add(9);
        two.add(20);
        List<Integer> three = new ArrayList<>();
        three.add(15);
        three.add(7);
        expected.add(one);
        expected.add(two);
        expected.add(three);
        List<List<Integer>> actual = solutionTest.levelOrder(root);

        Assertions.assertEquals(actual, expected);


    }
}
