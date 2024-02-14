from typing import Optional

from treenode.treenode import TreeNode


class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def dfs(node, min_value, max_value):
            if not node:
                return True

            if not (min_value < node.val < max_value):
                return False

            return dfs(node.left, min_value, node.val) and dfs(node.right, node.val, max_value)

        return dfs(root, -float("inf"), float("inf"))
