package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestIsSameTree(t *testing.T) {
	p := &TreeNode{Val: 1}
	p.Left = &TreeNode{Val: 2}
	p.Right = &TreeNode{Val: 3}

	q := &TreeNode{Val: 1}
	q.Left = &TreeNode{Val: 2}
	q.Right = &TreeNode{Val: 3}

	actual := isSameTree(p, q)
	expected := true

	assert.Equal(t, expected, actual)
}

func TestIsSameTreeTwo(t *testing.T) {
	p := &TreeNode{Val: 1}
	p.Left = &TreeNode{Val: 2}
	p.Right = &TreeNode{Val: 3}

	q := &TreeNode{Val: 1}
	q.Left = &TreeNode{Val: 2}
	q.Right = &TreeNode{Val: 4}

	actual := isSameTree(p, q)
	expected := false

	assert.Equal(t, expected, actual)

}
