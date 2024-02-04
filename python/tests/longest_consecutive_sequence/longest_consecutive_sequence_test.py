import unittest

from longest_consecutive_sequence.longest_consecutive_sequence import Solution


class TestSolution(unittest.TestCase):
    def test_LongestConsecutive(self):
        solution = Solution()

        nums_1 = [100, 4, 200, 1, 3, 2]
        nums_2 = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]

        self.assertEqual(solution.longestConsecutive(nums_1), 4)
        self.assertEqual(solution.longestConsecutive(nums_2), 9)





