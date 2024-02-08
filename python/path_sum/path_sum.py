from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    def hhasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
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


# Example usage:
# Create a binary tree
root = TreeNode(5)
root.left = TreeNode(4)
root.right = TreeNode(8)

root.left.left = TreeNode(11)
root.left.left.left = TreeNode(7)
root.left.left.right = TreeNode(2)

root.right.left = TreeNode(13)
root.right.right = TreeNode(4)
root.right.right.right = TreeNode(1)

target_sum = 17
print(Solution().hhasPathSum(root, target_sum))
