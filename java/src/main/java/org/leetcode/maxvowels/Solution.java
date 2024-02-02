package org.leetcode.maxvowels;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int maxVowels(String s, int k) {
        int max_vowels = 0;
        int count = 0;
        List<String> charList = Arrays.asList(s.split(""));
        String[] vowels = new String[]{"a", "e", "i", "o", "u"};
        List<String> list = Arrays.asList(vowels);

        for (int i = 0; i < k; i++) {
            if (list.contains(charList.get(i))) {
                count++;
            }
        }
        max_vowels = Math.max(max_vowels, count);

        int left = 1;
        int right = left + k - 1;

        while (right < charList.size()) {
            String word = charList.get(right);
            String prev = charList.get(left - 1);
            if (list.contains(word)) {
                count++;
            }
            if (list.contains(prev)) {
                count--;
            }
            max_vowels = Math.max(max_vowels, count);
            left++;
            right++;
        }

        return max_vowels;
    }

    public static int maxi(String s, int k) {
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
