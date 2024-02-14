from typing import Optional

from treenode.treenode import TreeNode


class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> int:
        prefixSum = {0: 1}

        def dfs(node, currSum):
            if node is None:
                return 0
            currSum += node.val

            count = prefixSum.get(currSum - targetSum, 0)
            prefixSum[currSum] = prefixSum.get(currSum, 0) + 1

            count += dfs(node.left, currSum) + dfs(node.right, currSum)

            prefixSum[currSum] -= 1

            return count

        return dfs(root, 0)
