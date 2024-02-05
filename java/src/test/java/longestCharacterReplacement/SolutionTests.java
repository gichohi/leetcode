package longestCharacterReplacement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.longestCharacterReplacement.Solution;

public class SolutionTests {

    @Test
    void testCharacterReplacement(){
        Solution solutionTest = new Solution();
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        int actual = solutionTest.characterReplacement(s, k);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testCharacterReplacementTwo(){
        Solution solutionTest = new Solution();
        String s = "AABABBA";
        int k = 2;
        int expected = 5;
        int actual = solutionTest.characterReplacement(s, k);
        Assertions.assertEquals(actual, expected);
    }
}
