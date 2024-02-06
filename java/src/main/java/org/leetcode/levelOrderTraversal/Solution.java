package org.leetcode.levelOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (! queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                levelValues.add(node.val);

                if(node.left != null) {
                    queue.add(node);
                }
                if(node.right != null) {
                    queue.add(node);
                }
            }
            result.add(levelValues);
        }

    return result;
    }

    public static void main(String[] args){
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode root = new TreeNode(3);
        root.left = nine;
        root.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        Solution solution = new Solution();
        System.out.println(solution.levelOrder(root));

    }
}

