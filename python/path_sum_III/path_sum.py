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


root = TreeNode(10)
root.left = TreeNode(5)
root.right = TreeNode(-3)

root.left.left = TreeNode(3)
root.left.right = TreeNode(2)

root.right.right = TreeNode(11)

root.left.left.left = TreeNode(3)
root.left.left.right = TreeNode(-2)

root.left.right.right = TreeNode(1)
target = 8

print(Solution().pathSum(root, target))