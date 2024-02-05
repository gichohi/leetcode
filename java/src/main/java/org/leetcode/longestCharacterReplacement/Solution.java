package org.leetcode.longestCharacterReplacement;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/*
Initialize an empty dictionary count to keep track of character frequencies within the sliding window.
Initialize variables longest, left, and right to keep track of the maximum length of the substring, the left pointer, and the right pointer.
Iterate through the string using the right pointer.
Update the frequency of the current character in the count map.
Check if the length of the current substring minus the frequency of the most frequent character exceeds the allowed replacements (k).
If yes, move the left pointer to the right and decrement the frequency of the character at the left pointer.
Update the maximum length of the substring (ans) at each step.
Return the final result.
 */

public class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int longest = 0;
        int left = 0;
        int right = 0;

        for(;right < s.length();right++){
            // Update the count of the current character in the dictionary
            char ch = s.charAt(right);
            if(count.containsKey(ch)){
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
             // Check if the current window size minus the count of the most frequent character
             // is greater than the allowed replacements (k)
            Map.Entry<Character, Integer> maxEntry = count.entrySet().stream()
                    .max(Comparator.comparing(Map.Entry::getValue))
                    .orElse(null);
            if((right - left + 1) - maxEntry.getValue() > k){
                // If so, move the left pointer and decrease the count of the character at the left
                char ch_left = s.charAt(left);
                count.put(ch_left, count.get(ch_left) - 1);
                left += 1;
            } else {
                longest = Math.max(longest, (right - left + 1));
            }

        }

        return longest;
    }
}
