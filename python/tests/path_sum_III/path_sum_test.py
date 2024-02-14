import unittest

from path_sum_III.path_sum import Solution, TreeNode


class TestSolution(unittest.TestCase):

    def test_PathSum(self):
        solution = Solution()
        root = TreeNode(10)
        root.left = TreeNode(5)
        root.right = TreeNode(-3)

        root.left.left = TreeNode(3)
        root.left.right = TreeNode(2)

        root.right.right = TreeNode(11)

        root.left.left.left = TreeNode(3)
        root.left.left.right = TreeNode(-2)

        root.left.right.right = TreeNode(1)
        target = 8

        actual = solution.pathSum(root, target)
        expected = 3
        self.assertEqual(expected, actual)
