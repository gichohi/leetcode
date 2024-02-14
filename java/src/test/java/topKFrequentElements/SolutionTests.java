package topKFrequentElements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.topKFrequentElements.Solution;

public class SolutionTests {

    @Test
    void TestTopKFrequent(){
        Solution solutionTest = new Solution();
        int[] nums = {1,1,1,2,2,3,4,4,4,4};
        int k = 2;
        int[] expected = new int[]{4, 1};
        int[] actual = solutionTest.topKFrequent(nums,k);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void TestTopKFrequentTwo(){
        Solution solutionTest = new Solution();
        int[] nums = {1,1,1,1,2,2,3,3,3,4,4};
        int k = 2;
        int[] expected = new int[]{1, 3};
        int[] actual = solutionTest.topKFrequent(nums,k);
        Assertions.assertArrayEquals(expected, actual);
    }
}
