package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestTwoSum(t *testing.T) {
	var nums = []int{1, 2, 7, 11}
	var target = 9
	var expected = []int{2, 1}
	result := TwoSum(nums, target)
	assert.Equal(t, result, expected)

}
