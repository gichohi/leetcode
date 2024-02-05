package numberOfIslands;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.numberOfIslands.Solution;

public class SolutionTests {

    @Test
    void testNumIslands() {
        Solution solutionTest = new Solution();
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int expected = 3;
        int actual = solutionTest.numIslands(grid);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testNumIslandsTwo() {
        Solution solutionTest = new Solution();
        char[][] grid = {
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'1', '1', '0', '1', '1'}
        };

        int expected = 5;
        int actual = solutionTest.numIslands(grid);
        Assertions.assertEquals(actual, expected);
    }
}
