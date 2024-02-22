import unittest

from koko.Solution import Solution


class TestSolution(unittest.TestCase):

    def test_MinEatingSpeed(self):
        solution = Solution()
        piles = [30, 11, 23, 4, 20]
        h = 5
        expected = 30
        actual = solution.minEatingSpeed(piles, h)
        self.assertEqual(expected, actual)

    def test_MinEatingSpeedTwo(self):
        solution = Solution()
        piles = [30, 11, 23, 4, 20]
        h = 6
        expected = 23
        actual = solution.minEatingSpeed(piles, h)
        self.assertEqual(expected, actual)
