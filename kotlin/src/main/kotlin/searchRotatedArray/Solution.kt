package searchRotatedArray

import kotlin.math.floor

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if(nums.isEmpty()){
            return -1
        }
        var left = 0
        var right = nums.size - 1
        while(left <= right){
            val mid = floor(((right + left) / 2).toDouble()).toInt()

            if(nums[mid] == target){
                return mid
            }
            // if left half is sorted
            else if(nums[left] <= nums[mid]) {
                // if target is in the left half of the array
                if(nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1
                } else{
                    left = mid + 1
                }
            // right half is sorted
            } else {
                //if target is in the right half of the array
                if(nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1
                } else{
                    right = mid - 1
                }
            }
        }
        return -1
    }
}

fun main(){
    val nums = intArrayOf(1)
    val target = 1
    print(Solution().search(nums,target))
}