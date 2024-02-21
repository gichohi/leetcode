from typing import List


class Solution:
    # Moore voting algorithm
    def majorityElement(self, nums: List[int]) -> int:
        votes = 0
        candidate = 0
        for num in nums:
            if votes == 0:
                candidate = num
            if num == candidate:
                votes += 1
            else:
                votes -= 1
        return candidate


nums = [2, 2, 1, 1, 1, 2, 2]
print(Solution().majorityElement(nums))
