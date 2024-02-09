package longestPalindromeLength;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.longestPalindromeLength.Solution;

public class SolutionTests {

    @Test
    void TestLongestPalindrome(){
        Solution solutionTest = new Solution();
        String s = "littleredridinghood";
        int expected = 15;
        int actual = solutionTest.longestPalindrome(s);
        Assertions.assertEquals(actual, expected);
    }
}
