import unittest

from treenode.treenode import TreeNode
from validate_bst.validate_bst import Solution


class TestSolution(unittest.TestCase):

    def test_IsValid(self):
        solution = Solution()
        root = TreeNode(2)
        root.left = TreeNode(1)
        root.right = TreeNode(3)

        expected = True
        actual = solution.isValidBST(root)
        self.assertEqual(expected, actual)

    def test_IsValidTwo(self):
        solution = Solution()
        root = TreeNode(5)
        root.left = TreeNode(1)
        root.right = TreeNode(4)
        root.right.left = TreeNode(3)
        root.right.right = TreeNode(6)

        expected = False
        actual = solution.isValidBST(root)
        self.assertEqual(expected, actual)

