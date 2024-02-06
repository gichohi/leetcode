package levelOrderTraversal;

import org.leetcode.levelOrderTraversal.Solution;
import org.leetcode.levelOrderTraversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionTests {

    @Test
    void testLevelOrder(){
        Solution solutionTest = new Solution();
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode root = new TreeNode(3);
        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(5);
        List<Integer> two = new ArrayList<>();
        two.add(9);
        two.add(20);
        List<Integer> three = new ArrayList<>();
        two.add(15);
        two.add(7);
        expected.add(one);
        expected.add(two);
        expected.add(three);
        List<List<Integer>> actual = solutionTest.levelOrder(root);




    }
}
