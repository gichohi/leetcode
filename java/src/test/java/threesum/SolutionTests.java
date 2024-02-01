package threesum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.threesum.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionTests {
    @Test
    void testThreeSum() {
        Solution threeSumTest = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSumTest.threeSum(nums);
        int[][] ints = {{-1, -1, 2}, {-1, 0, 1}};
        List<List<Integer>> expected = Arrays.stream(ints)
                .map(row -> Arrays.stream(row)
                        .boxed()
                        .collect(Collectors.toList()))
                .toList();
        Assertions.assertEquals(expected, result);
    }
}
