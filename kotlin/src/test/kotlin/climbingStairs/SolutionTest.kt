package climbingStairs

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun testClimbingStairs(){
        val n = 1
        val expected = 1
        val actual = solution.climbStairs(n)
        assertEquals(expected, actual)
    }

    @Test
    fun testClimbingStairsTwo(){
        val n = 5
        val expected = 8
        val actual = solution.climbStairs(n)
        assertEquals(expected, actual)
    }
}