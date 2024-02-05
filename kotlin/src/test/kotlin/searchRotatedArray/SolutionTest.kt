package searchRotatedArray

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SolutionTest {
    private val test: Solution = Solution()

    @Test
    fun testSearch() {
        val nums = intArrayOf(4,5,6,7,0,1,2)
        val target = 1
        val expected = 5
        val actual = test.search(nums, target)
        Assertions.assertEquals(expected, actual)
    }
}