package main

import (
	"fmt"
	"testing"
)

func TestMergeTrees(t *testing.T) {
	root1 := &TreeNode{Val: 1}
	root1.Left = &TreeNode{Val: 3}
	root1.Right = &TreeNode{Val: 2}

	root2 := &TreeNode{Val: 2}
	root2.Left = &TreeNode{Val: 1}
	root2.Right = &TreeNode{Val: 3}

	actual := mergeTrees(root1, root2)
	fmt.Println(actual)

}
