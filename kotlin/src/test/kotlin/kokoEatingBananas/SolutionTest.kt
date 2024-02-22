package kokoEatingBananas

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solutionTest = Solution()
    @Test
    fun testMinEatingSpeed(){
        val piles = intArrayOf(30,11,23,4,20)
        val h = 5
        val expected = 30
        val actual = solutionTest.minEatingSpeed(piles, h)
       assertEquals(expected, actual)
    }

    @Test
    fun testMinEatingSpeedTwo(){
        val piles = intArrayOf(30,11,23,4,20)
        val h = 6
        val expected = 23
        val actual = solutionTest.minEatingSpeed(piles, h)
        assertEquals(expected, actual)
    }

    @Test
    fun testMinEatingSpeedThree(){
        val piles = intArrayOf(3,6,7,11)
        val h = 8
        val expected = 4
        val actual = solutionTest.minEatingSpeed(piles, h)
        assertEquals(expected, actual)
    }
}