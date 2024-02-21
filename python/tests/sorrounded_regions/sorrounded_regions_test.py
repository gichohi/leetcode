import unittest

from sorrounded_regions.sorrounded_regions import Solution


class TestSolution(unittest.TestCase):
    def test_Solve(self):
        solution = Solution()
        board = [["X", "X", "X", "X"], ["X", "O", "O", "X"], ["X", "X", "O", "X"], ["X", "O", "X", "X"]]
        expected = [['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'X', 'X', 'X'], ['X', 'O', 'X', 'X']]
        actual = solution.solve(board)
        self.assertListEqual(expected, actual)

