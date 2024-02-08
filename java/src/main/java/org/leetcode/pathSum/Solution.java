package org.leetcode.pathSum;

import org.leetcode.binaryTree.TreeNode;

import java.awt.*;

public class Solution {

    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        return dfs(root, 0);
    }

    private boolean dfs(TreeNode node, int currSum){
        if(node == null){
            return false;
        }
        currSum += node.val;
        // If the current node is a leaf, check if the sum equals targetSum
        if(node.left == null && node.right == null){
            return currSum == target;
        }

        return dfs(node.left, currSum) || dfs(node.right, currSum);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);

        int targetSum = 6;
        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(root, targetSum));
    }
}
