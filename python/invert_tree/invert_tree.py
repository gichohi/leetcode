from typing import Optional

from treenode.treenode import TreeNode


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:

        def dfs(node):
            if not node:
                return None
            temp = node.left
            node.left = node.right
            node.right = temp
            dfs(node.left)
            dfs(node.right)
            return node

        return dfs(root)


root = TreeNode(4)
root.left = TreeNode(2)
root.right = TreeNode(7)
root.left.left = TreeNode(1)
root.left.right = TreeNode(3)
root.right.left = TreeNode(6)
root.right.right = TreeNode(9)
node = Solution().invertTree(root)
print(node.right.left.val)

