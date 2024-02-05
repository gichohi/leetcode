package longestConsecutiveSequence

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    private val solutionTest: Solution = Solution();
    @Test
    fun testLongestConsecutive(){
        val nums = intArrayOf(100,4,200,1,3,2)
        val expected = 4
        val actual = solutionTest.longestConsecutive(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun testLongestConsecutiveTwo(){
        val nums = intArrayOf(1)
        val expected = 1
        val actual = solutionTest.longestConsecutive(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun testLongestConsecutiveThree(){
        val nums = intArrayOf(0,3,7,2,5,8,4,6,0,1)
        val expected = 9
        val actual = solutionTest.longestConsecutive(nums)
        assertEquals(expected, actual)
    }
}