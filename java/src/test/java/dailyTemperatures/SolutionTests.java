package dailyTemperatures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.dailyTemperatures.Solution;

public class SolutionTests {
    @Test
    void testDailyTemperatures(){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        Solution solutionTest = new Solution();
        int[] actual = solutionTest.dailyTemperatures(temperatures);
        int[] expected = {1,1,4,2,1,1,0,0};
        Assertions.assertArrayEquals(actual, expected);
    }
}
