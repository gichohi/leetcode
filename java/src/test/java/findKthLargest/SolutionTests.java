package findKthLargest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.findKthLargest.Solution;

public class SolutionTests {
    @Test
    void testFindKthLargest(){
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        Solution solutionTest = new Solution();
        int expected = 4;
        int actual = solutionTest.findKthLargest(nums, k);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void testFindKthLargestTwo(){
        int[] nums = new int[]{3,2,1,5,6,4};
        int k = 2;
        Solution solutionTest = new Solution();
        int expected = 5;
        int actual = solutionTest.findKthLargest(nums, k);
        Assertions.assertEquals(expected, actual);
    }
}
