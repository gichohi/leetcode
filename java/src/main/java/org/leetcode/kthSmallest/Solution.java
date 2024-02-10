package org.leetcode.kthSmallest;

import org.leetcode.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> result;
    public int kthSmallest(TreeNode root, int k) {
        result = new ArrayList<>();
        dfs(root);
        return result.get(k - 1);
    }

    // inorder traversal
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        result.add(node.val);
        dfs(node.right);
    }
}
