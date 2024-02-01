package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestMaxProfit(t *testing.T) {
	var prices = []int{7, 1, 5, 3, 6, 4}
	result := MaxProfit(prices)
	expected := 5
	assert.Equal(t, result, expected)
}
