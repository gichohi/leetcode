from typing import Optional, List


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        if root is None:
            return []

        def dfs(node, path):
            if node is None:
                return

            path.append(node.val)
            if node.left is None and node.right is None and sum(path) == targetSum:
                result.append(path[:])

            dfs(node.left, path)
            dfs(node.right, path)

            path.pop()

        result = []
        dfs(root, [])
        return result


# Example usage:
# Constructing a sample binary tree
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
print(Solution().pathSum(root, targetSum))  # Output: [[5, 4, 11, 2], [5, 8, 4, 5]]
