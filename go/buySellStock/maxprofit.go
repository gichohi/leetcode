package main

import "math"

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
func MaxProfit(prices []int) int {
	left := 0
	right := 1
	maxprofit := 0

	for right < len(prices) {
		currentprofit := prices[right] - prices[left]
		if prices[right] > prices[left] {
			maxprofit = int(math.Max(float64(maxprofit), float64(currentprofit)))
		} else {
			left = right
		}
		right += 1
	}
	return maxprofit
}
