package longestPalindrome;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.longestPalindrome.Solution;

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
