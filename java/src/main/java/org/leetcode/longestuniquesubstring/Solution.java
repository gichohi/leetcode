package org.leetcode.longestuniquesubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Using the sliding window technique. Define left
        // and right pointers.
        int left = 0;
        int right = 0;

        int longest = 0;
        char[] chars = s.toCharArray();
        int n = chars.length;

        Map<Character, Integer> map = new HashMap<>();

        while (right < n){
            // if chars[i] is not in map, increase the windows size
            if(! map.containsKey(chars[right])) {
                longest = Math.max(longest, right - left + 1);
            } else {
                // If current character is not in the window, increase window size.
                if(map.get(chars[right]) < left) {
                    longest = Math.max(longest, right - left + 1);
                } else {
                    left = map.get(chars[right]) + 1;
                }
            }
            map.put(chars[right], right);
            right++;
        }
    return longest;
    }
}