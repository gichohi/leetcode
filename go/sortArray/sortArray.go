package main

import (
	"math"
)

func SortArray(nums []int) []int {
	return mergeSort(nums)
}

func mergeSort(nums []int) []int {
	length := len(nums)
	if length == 1 {
		return nums
	}
	mid := int(math.Floor(float64(length / 2)))
	leftArray := nums[0:mid]
	rightArray := nums[mid:length]

	left := mergeSort(leftArray)
	right := mergeSort(rightArray)

	return merge(left, right)
}

func merge(leftArray []int, rightArray []int) []int {
	left := 0
	right := 0
	i := 0
	nums := make([]int, len(leftArray)+len(rightArray))

	for left < len(leftArray) && right < len(rightArray) {
		if leftArray[left] < rightArray[right] {
			nums[i] = leftArray[left]
			left += 1
		} else {
			nums[i] = rightArray[right]
			right += 1
		}
		i += 1
	}

	for left < len(leftArray) {
		nums[i] = leftArray[left]
		left += 1
		i += 1
	}
	for right < len(rightArray) {
		nums[i] = rightArray[right]
		right += 1
		i += 1
	}

	return nums
}
