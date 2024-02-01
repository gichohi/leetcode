package firstMissingPositive

import kotlin.math.abs

class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val n = nums.size
        // Mark negative numbers and numbers greater than n as n+1
        for (i in 0..< n) {
            if (nums[i] in (n + 1)..-1) {
                nums[i] = n + 1
            }
        }

        // Mark the presence of positive numbers by changing the sign of the corresponding index
        for (i in 0..< n) {
            val num = abs(nums[i])
            if (num in (1.. n)) {
                nums[num - 1] *= -abs(nums[num - 1])
            }
        }

        // Find the first positive index, which represents the smallest missing positive integer
        for (i in 0..< n) {
            if (nums[i] > 0) {
                return i + 1
            }
        }
        return n + 1
    }
}