package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsValidBST(t *testing.T) {
	root := &TreeNode{Val: 2}
	root.Left = &TreeNode{Val: 1}
	root.Right = &TreeNode{Val: 3}
	actual := isValidBST(root)
	expected := true
	assert.Equal(t, expected, actual)
}

func TestIsValidBST2(t *testing.T) {
	root := &TreeNode{Val: 5}
	root.Left = &TreeNode{Val: 1}
	root.Right = &TreeNode{Val: 4}
	root.Right.Left = &TreeNode{Val: 3}
	root.Right.Right = &TreeNode{Val: 6}

	actual := isValidBST(root)
	expected := false
	assert.Equal(t, expected, actual)
}
