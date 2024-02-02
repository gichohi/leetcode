package longestuniquesubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.longestuniquesubstring.Solution;

public class SolutionTests {

    @Test
    void testLengthOfLongestSubstring(){
        String word = "bcbdefac";
        Solution solution = new Solution();
        int actual = solution.lengthOfLongestSubstring(word);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testAnotherSubstring(){
        String word = "abcabcbb";
        Solution solution = new Solution();
        int actual = solution.lengthOfLongestSubstring(word);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }
}
