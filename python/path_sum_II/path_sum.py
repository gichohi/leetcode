from typing import Optional, List

from treenode.treenode import TreeNode


class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        if root is None:
            return []

        def dfs(node, path, currSum):
            if node is None:
                return

            path.append(node.val)
            currSum += node.val
            if node.left is None and node.right is None and currSum == targetSum:
                result.append(path[:])

            dfs(node.left, path, currSum)
            dfs(node.right, path, currSum)

            path.pop()

        result = []
        dfs(root, [], 0)
        return result
