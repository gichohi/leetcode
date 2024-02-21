import unittest

from rotting_oranges.rotting_oranges import Solution


class TestSolution(unittest.TestCase):
    def test_Rotting_Oranges(self):
        solution = Solution()
        grid = [[2, 1, 1], [1, 1, 0], [0, 1, 1]]
        expected = 4
        actual = solution.orangesRotting(grid)
        self.assertEqual(expected, actual)

    def test_Rotting_Oranges_Two(self):
        solution = Solution()
        grid = [[2, 1, 1], [0, 1, 1], [1, 0, 1]]
        expected = -1
        actual = solution.orangesRotting(grid)
        self.assertEqual(expected, actual)


