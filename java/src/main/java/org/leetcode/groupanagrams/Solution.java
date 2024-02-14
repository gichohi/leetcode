package org.leetcode.groupanagrams;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> word = new HashMap<>();

        List<List<String>> result = new ArrayList<>();

        for(String str: strs){
            // Declare array of 26, for the letters of the alphabet
            int[] freqList = new int[26];
            Arrays.fill(freqList, 0);

            // for each letter in str, increment frequency.
            // Anagrams will produce the same frequency list
            for(char ch: str.toCharArray()){
                freqList[ch - 'a'] += 1;
            }
            // Convert array to list to se as key in map
            List<Integer> list = Arrays.stream(freqList).boxed().toList();
            if(word.containsKey(list)){
                List<String> existingList = word.get(list);
                existingList.add(str);
                word.put(list, existingList);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                word.put(list, newList);
            }
        }

        for(Map.Entry<List<Integer>, List<String>> entry: word.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}
