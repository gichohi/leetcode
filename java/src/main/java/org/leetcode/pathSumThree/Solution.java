package org.leetcode.pathSumThree;

import org.leetcode.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    int target;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        prefixSum.put(0, 1);
        target = targetSum;
        return dfs(root, 0, prefixSum);
    }

    private int dfs(TreeNode node, int currSum, Map<Integer, Integer> prefixSum) {
        if(node == null){
            return 0;
        }

        currSum += node.val;

        int totalPaths = prefixSum.getOrDefault(currSum - target, 0);
        prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);

        totalPaths += dfs(node.left, currSum, prefixSum) + dfs(node.right, currSum, prefixSum);
        prefixSum.put(currSum, prefixSum.get(currSum) - 1);

        return totalPaths;
    }



    public static void main(String[] args){
        Solution solution = new Solution();

        // Constructing a sample binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

        root.right.right = new TreeNode(11);


        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);

        root.left.right.right = new TreeNode(1);


        int targetSum = 8;
        int result = solution.pathSum(root, targetSum);
        System.out.println(result);
    }
}
