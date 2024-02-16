from typing import Optional, List

from treenode.treenode import TreeNode

class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        return self.inOrder(p) == self.inOrder(q)

    def inOrder(self, root: Optional[TreeNode]) -> List[int]:
        res = []

        def dfs(node):
            if not node:
                return
            dfs(node.left)
            res.append(node.val)
            dfs(node.right)

        dfs(root)
        return res


p = TreeNode(1)
p.right = TreeNode(1)

q = TreeNode(1)
q.left = TreeNode(1)

print(Solution().isSameTree(p, q))
