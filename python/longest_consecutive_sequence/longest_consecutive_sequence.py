from typing import List


class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_map = {}
        longest = 0
        # put the array in a hash
        for num in nums:
            num_map[num] = 1
        # for every nums[i] in the hash,
        # check if nums[i] - 1 is in the hash
        # if no, nums[i] is the start element of a consecutive sequence,
        # if yes, increment the current sequence size
        for num in nums:
            prev = num - 1
            if prev not in num_map:
                # element is first in a consecutive sequence
                curr = num
                while curr in num_map:
                    curr += 1

                longest = max(longest, curr - num)
        return longest
