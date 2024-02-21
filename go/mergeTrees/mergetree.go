package main

import "fmt"

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func mergeTrees(root1 *TreeNode, root2 *TreeNode) *TreeNode {
	res := &TreeNode{}
	if root1 == nil {
		return root2
	} else if root2 == nil {
		return root1
	}
	res = mergeTrees(root1, root2)
	res.Left = mergeTrees(root1.Left, root2.Left)
	res.Right = mergeTrees(root1.Left, root2.Left)
	return res
}

func main() {
	root1 := &TreeNode{Val: 1}
	root1.Left = &TreeNode{Val: 3}
	root1.Right = &TreeNode{Val: 2}

	root2 := &TreeNode{Val: 2}
	root2.Left = &TreeNode{Val: 1}
	root2.Right = &TreeNode{Val: 3}

	fmt.Println(mergeTrees(root1, root2))
}
