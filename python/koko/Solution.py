import math
from typing import List


class Solution:
    """
    To solve this problem we are going to do a binary search
    in the range 1 to max(piles). We initialise two pointers left and right.
    Determine the mid-point between them, and calculate the number of hours
    it will take to eat all the piles. Increment or decrement pointers
    depending on whether this value is greater or less than h.
    """
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        left, right = 1, max(piles)
        res = -1

        while left <= right:
            hours_to_eat = 0
            mid = (left + right) // 2
            for pile in piles:
                # for each p, calculate num of hours needed to eat and round up
                hours_to_eat += math.ceil(pile / mid)
            if hours_to_eat <= h:
                res = mid
                right = mid - 1
            else:
                left = mid + 1
        return res