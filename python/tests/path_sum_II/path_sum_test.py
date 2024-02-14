import unittest

from path_sum_II import Solution
from treenode.treenode import TreeNode


class TestSolution(unittest.TestCase):

    def test_PathSum(self):
        solution = Solution()

        root = TreeNode(5)
        root.left = TreeNode(4)
        root.right = TreeNode(8)
        root.left.left = TreeNode(11)
        root.left.left.left = TreeNode(7)
        root.left.left.right = TreeNode(2)
        root.right.left = TreeNode(13)
        root.right.right = TreeNode(4)
        root.right.right.left = TreeNode(5)
        root.right.right.right = TreeNode(1)

        targetSum = 22

        expected = solution.pathSum(root, targetSum)
        actual = [[5, 4, 11, 2], [5, 8, 4, 5]]
        self.assertListEqual(expected, actual)
