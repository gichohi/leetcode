package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestSortArray(t *testing.T){
	var nums = []int {11,7,2,8,1,5,15,17,3}
	var actual = []int {2,3,5,7,8,11,15,17}
	expected := SortArray(nums)
	assert.Equal(expected, actual)
}