import unittest

from max_k_sum_pairs.Solution import Solution


class TestSolution(unittest.TestCase):

    def test_MaxOperations(self):
        solution = Solution()
        nums = [1, 2, 3, 4]
        k = 5
        expected = 2
        actual = solution.maxOperations(nums, k)
        self.assertEqual(expected, actual)

    def test_MaxOperationsTwo(self):
        solution = Solution()
        nums = [3, 1, 3, 4, 3]
        k = 6
        expected = 1
        actual = solution.maxOperations(nums, k)
        self.assertEqual(expected, actual)

    def test_MaxOperationsThree(self):
        solution = Solution()
        nums = [2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2]
        k = 3
        expected = 4
        actual = solution.maxOperations(nums, k)
        self.assertEqual(expected, actual)
