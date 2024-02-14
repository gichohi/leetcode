import unittest

from closest_k.closest_k import Solution


class TestSolution(unittest.TestCase):

    def test_KClosest(self):
        solution = Solution()
        points = [[3, 3], [5, -1], [-2, 4]]
        k = 2
        expected = solution.kClosest(points, k);
        actual = [[-2, 4], [3, 3]]
        self.assertListEqual(expected, actual)
