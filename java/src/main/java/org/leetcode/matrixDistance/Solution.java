package org.leetcode.matrixDistance;

import java.security.KeyPair;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null){
            return null;
        }

        int M = mat.length;
        int N = mat[0].length;
        Deque<Pair> deque = new ArrayDeque<>();

        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(mat[i][j] == 0){
                    deque.add(new Pair(i, j));
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        Pair[] directions = {new Pair(0, 1), new Pair(0, -1), new Pair(1, 0), new Pair(-1, 0)};

        while (! deque.isEmpty()){
            Pair pair = deque.pollFirst();
            for(Pair d: directions){
                int nX = pair.x + d.x;
                int nY = pair.y + d.y;
                if(nX >= 0 && nX < M && nY >= 0 && nY < N && mat[nY][nX] == -1){
                    mat[nX][nY] = mat[pair.x][pair.y] + 1;
                    deque.addLast(new Pair(nX, nY));
                }
            }
        }
        return mat;
    }

    private class Pair {
         int x;
        private int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.updateMatrix(matrix)));
    }
}
