from collections import deque
from typing import Optional, List

from treenode.treenode import TreeNode


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []

        if not root:
            return result

        queue = deque()
        queue.append(root)

        while queue:
            size = len(queue)
            levels = []
            for i in range(size):
                node = queue.popleft()
                levels.append(node.val)
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)

            result.append(levels)

        return result
