package numberPalindrome

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val s = x.toString();
        val chars = s.split("").toMutableList()
        var left = 0;
        var right = chars.size - 1
        while(left < right){
            val temp = chars[left];
            chars[left] = chars[right]
            chars[right] = temp
            left++
            right--
        }
        val t = chars.joinToString("")
        return s == t
    }
}