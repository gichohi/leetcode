package closestKPoints;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.closestKPoints.Solution;

public class SolutionTests {
    @Test
    void TestKClosest(){
        int[][] points = new int[][] {{3,3},{5,-1},{-2,4},{-1, 2}};
        int k = 2;
        Solution solutionTest = new Solution();
        int[][] expected = new int[][]{{3,3}, {-1,2}};
        int[][] actual = solutionTest.kClosest(points,k);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void TestKClosestTwo(){
        int[][] points = new int[][] {{1,3},{-2,2}};
        int k = 1;
        Solution solutionTest = new Solution();
        int[][] expected = new int[][]{{-2,2}};
        int[][] actual = solutionTest.kClosest(points,k);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void TestKClosestThree(){
        int[][] points = new int[][] {{9997,9997},{9996,9998}}
        ;
        int k = 1;
        Solution solutionTest = new Solution();
        int[][] expected = new int[][]{{9997,9997}};
        int[][] actual = solutionTest.kClosest(points,k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
