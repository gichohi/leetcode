package org.leetcode.closestKPoints;

import java.awt.desktop.SystemEventListener;
import java.util.*;

public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] distances = new int[k][2];
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (a, b) -> Double.compare(Math.sqrt(Math.pow(b[0],2) + Math.pow(b[1],2)), Math.sqrt(Math.pow(a[0],2) + Math.pow(a[1],2))));

        for (int[] point : points) {
            queue.offer(point);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        for(int i=0;i<k;i++){
            distances[i] = queue.poll();
        }

        return distances;
    }

    public static void main(String[] args){
        int[][] points = new int[][] {{9997,9997},{9996,9998}};
        int k = 1;
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.kClosest(points, k)));
    }
}
