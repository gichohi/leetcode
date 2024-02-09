package org.leetcode.longestPalindromeSubstring;

import java.util.Arrays;

public class Solution {
    public static String longestPalindrome(String s) {
        //Preprocess the string to insert special characters '#'
        String[] strs = s.split("");
        StringBuilder processed = new StringBuilder("#");
        for(String str: strs){
            processed.append(str).append("#");
        }
        int n = processed.length();



        return processed.toString();
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("littleredridinghood"));
    }
}
