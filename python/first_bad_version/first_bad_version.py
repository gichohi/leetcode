class Solution:

    def isBadVersion(self, n: int):
        if n >= 3:
            return True
        else:
            return False

    def firstBadVersion(self, n: int) -> int:
        left = 1
        right = n
        while left < right:
            # start at the middle
            mid = left + (right - left) // 2
            if not self.isBadVersion(mid):
                left = mid + 1
            else:
                right = mid
        return left


n = 11
print(Solution().firstBadVersion(n))
