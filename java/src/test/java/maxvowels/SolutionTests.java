package maxvowels;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.maxvowels.Solution;
public class SolutionTests {
    @Test
    void testMaxVowels() {
        Solution solutionTest = new Solution();
        String word_1 = "leetcode";
        String word_2 = "sequoia";
        Assertions.assertEquals(solutionTest.maxVowels(word_1, 3), 2);
        Assertions.assertEquals(solutionTest.maxVowels(word_2, 3), 3);
    }
}
