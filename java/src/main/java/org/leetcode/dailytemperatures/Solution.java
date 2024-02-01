package org.leetcode.dailytemperatures;

import java.util.Stack;

/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait
after the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

 */
public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temperatureStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();

        int[] result = new int[temperatures.length];
        // if the stack is not empty and if the temperatures[i] is greater
        // than the value at the top of the stack
        for (int i = 0; i < temperatures.length; i++) {
            while (!temperatureStack.empty() && temperatures[i] > temperatureStack.peek()) {
                temperatureStack.pop();
                int index = indexStack.pop();
                result[index] = i - index;

            }
            temperatureStack.push(temperatures[i]);
            indexStack.push(i);
                    
        }
        return result;
    }
}
