import unittest

from level_traversal.level_traversal import Solution, TreeNode


class TestSolution(unittest.TestCase):
    def testLevelOrder(self):
        solution = Solution()
        root = TreeNode(3)
        root.left = TreeNode(9)
        root.right = TreeNode(20)
        root.right.left = TreeNode(15)
        root.right.right = TreeNode(7)

        expected = [[3], [9, 20], [15, 7]]
        actual = solution.levelOrder(root)
        self.assertListEqual(actual, expected)
