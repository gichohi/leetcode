package org.leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int sum;
        int TARGET = 0;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            // skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if (sum == TARGET) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // skip duplicates for left
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // skip duplicates for right
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < TARGET) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }
        return res;
    }
}
