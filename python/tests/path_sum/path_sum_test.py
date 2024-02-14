import unittest

from path_sum.path_sum import Solution
from treenode.treenode import TreeNode


class TestSolution(unittest.TestCase):

    def test_hasPathSum(self):
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

        actual = solution.hasPathSum(root, targetSum)
        expected = True

        self.assertEqual(actual, expected)
