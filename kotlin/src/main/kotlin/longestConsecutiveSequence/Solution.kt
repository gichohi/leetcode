package longestConsecutiveSequence

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var longest = 0
        for(num in nums){
            var curr: Int;
            if(! set.contains(num - 1)){
                curr = num + 1
                // check if n is start of new sequence
                while(set.contains(curr)){
                    curr++
                }
                longest = longest.coerceAtLeast(curr - num)
            }
        }
        return longest
    }
}

