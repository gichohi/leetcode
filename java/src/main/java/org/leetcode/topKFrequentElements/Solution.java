package org.leetcode.topKFrequentElements;

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(k, (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            queue.offer(entry);

            // If the size of the heap is larger than k, we pop the element at the top.
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = k-1; i >= 0; i--) {
            result[i] = Objects.requireNonNull(queue.poll()).getKey();
        }

        return result;
    }
}
