from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


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
