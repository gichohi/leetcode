package org.leetcode.findKthLargest;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((x, y) -> y - x);
        for (int num : nums) {
            queue.add(num);
        }

        for(int i=0;i<k-1;i++){
            queue.poll();
        }
        int kLargest = queue.poll();
        return kLargest;
    }

    public static void main(String[] args){
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(nums, k));
    }
}
