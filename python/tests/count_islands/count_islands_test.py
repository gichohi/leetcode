import unittest

from count_islands.count_islands import Solution


class TestSolution(unittest.TestCase):
    def test_numIslands(self):
        solution = Solution()
        grid_1 = [
            ["1", "1", "0", "0", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "1", "0", "0"],
            ["0", "0", "0", "1", "1"]
        ]

        grid_2 = [
            ["1", "1", "1", "1", "0"],
            ["1", "1", "0", "1", "0"],
            ["1", "1", "0", "0", "0"],
            ["0", "0", "0", "0", "0"]
        ]

        self.assertEqual(solution.numIslands(grid_1), 3)
        self.assertEqual(solution.numIslands(grid_2), 1)
