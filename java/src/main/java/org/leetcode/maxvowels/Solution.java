package org.leetcode.maxvowels;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int maxVowels = 0;
        int currentVowels = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
        }

        maxVowels = Math.max(maxVowels, currentVowels);

        for (int i = k; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currentVowels--;
            }
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }


    public static void main(String[] args) {
        String word = "leetcode ";
        int k = 3;
        System.out.println(maxi(word, k));
    }
}
