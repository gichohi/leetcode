from typing import List


class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        count = 0
        d = {}
        for i in range(len(nums)):
            diff = k - nums[i]
            if d.get(diff, 0):
                d[diff] = 0
                d[nums[i]] = 0
                count += 1
            else:
                d[nums[i]] = i + 1
        return count


nums = [1, 2, 3, 4]
k = 6
print(Solution().maxOperations(nums, k))
