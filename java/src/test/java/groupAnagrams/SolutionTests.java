package groupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.leetcode.groupanagrams.Solution;

import java.util.Arrays;
import java.util.List;

public class SolutionTests {
    @Test
    void TestGroupAnagrams(){
        Solution solutionTest = new Solution();
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        String[][] anagrams = new String[][]{{"tan", "nat"}, {"bat"}, {"eat", "tea", "ate"}};
        List<List<String>> expected = Arrays.stream(anagrams)
                .map(Arrays::asList)
                .toList();
        List<List<String>> actual = solutionTest.groupAnagrams(strs);
        Assertions.assertEquals(expected, actual);
    }
}
