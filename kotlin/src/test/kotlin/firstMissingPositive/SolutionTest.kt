package firstMissingPositive

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solutionTest: Solution = Solution();

    @Test
    fun testFirstMissingPositive() {
        val nums = intArrayOf(3,4,-1,1)
        val expected = 1
        val actual = solutionTest.firstMissingPositive(nums)
        assertEquals(expected, actual)
    }
}