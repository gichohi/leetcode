package main

import "math"

type TreeNode struct {
	Val   int32
	Left  *TreeNode
	Right *TreeNode
}

func isValidBST(root *TreeNode) bool {
	return dfs(root, math.MinInt32, math.MaxInt32)
}

func dfs(node *TreeNode, minValue int32, maxValue int32) bool {
	if node == nil {
		return true
	}

	if !(node.Val > minValue && node.Val < maxValue) {
		return false
	}

	return dfs(node.Left, minValue, maxValue) && dfs(node.Right, node.Val, maxValue)
}
