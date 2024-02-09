package org.leetcode.maxLevelSum;

import org.leetcode.binaryTree.TreeNode;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> levelSums;
    int max_level_sum;
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        max_level_sum = 0;
        levelSums = new ArrayList<>();
        dfs(root, 0);
        return levelSums.indexOf(max_level_sum) + 1;
    }

    private void dfs(TreeNode node, int level){
        if(node == null){
            return;
        }
        if(level == levelSums.size()){
            levelSums.add(0);
        }

        int val = levelSums.get(level) + node.val;
        max_level_sum = Math.max(max_level_sum, val);
        levelSums.set(level, val);

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(-8);
        Solution solutionTest = new Solution();

        System.out.println(solutionTest.maxLevelSum(root));

    }
}
