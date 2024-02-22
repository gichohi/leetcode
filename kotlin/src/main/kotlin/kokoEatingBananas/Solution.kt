package kokoEatingBananas

import kotlin.math.ceil
import kotlin.math.floor

class Solution {
    /*
    To solve this problem we are going to do a binary search
    in the range 1 to max(piles). We initialise two pointers left and right.
    Determine the mid-point between them, and calculate the number of hours
    it will take to eat all the piles. Increment or decrement pointers
    depending on whether this value is greater or less than h.
     */
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()
        var hours: Int
        var mid: Int
        var result = -1


        while(left <= right){
            hours = 0
            mid = (floor((left + right).toDouble())/2).toInt()

            // For each pile calculate the number of hours required to eat,
            // then determine the cumulative total hours.
            for(pile in piles){
                hours += ceil((pile.toDouble() / mid.toDouble())).toInt()
            }
            if(hours <= h){
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return result
    }
}

fun main(){
    val piles = intArrayOf(30,11,23,4,20)
    val h = 5
    val actual = Solution().minEatingSpeed(piles, h)
    println(actual)
}