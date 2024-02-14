from typing import Optional

from treenode.treenode import TreeNode


class Solution:

    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        # Helper function to perform DFS traversal
        def dfs(node, current_sum):
            if not node:
                return False
            # If the current node is a leaf, check if the sum equals targetSum
            current_sum += node.val
            if not node.left and not node.right:
                return current_sum == targetSum

            return dfs(node.left, current_sum) or dfs(node.right, current_sum)

        # Start DFS from the root with an initial sum of 0
        return dfs(root, 0)
