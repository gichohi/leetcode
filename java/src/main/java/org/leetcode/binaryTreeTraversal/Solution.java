package org.leetcode.binaryTreeTraversal;
import org.leetcode.binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inOrder(root);
        return result;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        preOrder(root);
        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        postOrder(root);
        return result;
    }

    private void inOrder(TreeNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        result.add(node.val);
        inOrder(node.right);
    }

    private void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        result.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    private void postOrder(TreeNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        result.add(node.val);
    }
}