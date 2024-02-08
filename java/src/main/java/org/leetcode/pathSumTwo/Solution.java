package org.leetcode.pathSumTwo;

import org.leetcode.binaryTree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    int target;
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, path, 0);
        return result;
    }

    private void dfs(TreeNode node, List<Integer> path, int currSum) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        currSum += node.val;

        if (node.left == null && node.right == null && currSum == target) {
            result.add(new ArrayList<>(path));
        }

        dfs(node.left, path, currSum);
        dfs(node.right, path, currSum);

        // backtrack to a parent node to explore other
        // paths from the parent node.
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

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
        List<List<Integer>> result = solution.pathSum(root, targetSum);
        System.out.println(result);
    }
}
