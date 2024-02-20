import unittest

from matrix_distance.matrix_distance import Solution


class TestSolution(unittest.TestCase):

    def test_UpdateMatrix(self):
        solution = Solution()
        matrix = [[0, 0, 0], [0, 1, 0], [1, 1, 1]]
        actual = solution.updateMatrix(matrix)
        expected = [[0, 0, 0], [0, 1, 0], [1, 2, 1]]
        self.assertEqual(expected, actual)

    def test_UpdateMatrixTwo(self):
        solution = Solution()
        matrix = [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
        actual = solution.updateMatrix(matrix)
        expected = [[0, 0, 0], [0, 1, 0], [0, 0, 0]]
        self.assertEqual(expected, actual)
