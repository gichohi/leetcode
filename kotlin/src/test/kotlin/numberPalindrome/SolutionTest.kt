package numberPalindrome

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val test: Solution = Solution();

    @Test
    fun testIsPalindrome() {
        val num = 121
        val expected = true
        val actual = test.isPalindrome(num)
        assertEquals(actual, expected)
    }

    @Test
    fun testIsNotPalindrome() {
        val num = -121
        val expected = false
        val actual = test.isPalindrome(num)
        assertEquals(actual, expected)
    }

}