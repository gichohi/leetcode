package binarySearch

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


internal class SolutionTest {
    private val solutionTest: Solution = Solution();

    @Test
    fun testSearch(){
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 9
        val expected = 4
        val actual = solutionTest.search(nums, target)
        assertEquals(actual, expected)
    }

    @Test
    fun testSearchTwo(){
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 2
        val expected = -1
        val actual = solutionTest.search(nums, target)
        assertEquals(actual, expected)
    }
}