package com.altiran.dicemaster

import org.apache.commons.math3.random.MersenneTwister
import org.apache.commons.math3.stat.inference.ChiSquareTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class DiceRollTest {
    private val random = MersenneTwister()

    @Test
    fun testDiceRollUnbiased() {
        val rollResults = IntArray(6)
        val rollCount = 10000 // Increased sample size for better statistical significance

        // Roll the dice rollCount times
        for (i in 0 until rollCount) {
            val roll = random.nextInt(6) + 1
            rollResults[roll - 1]++
        }

        val expectedCount = DoubleArray(6) { rollCount / 6.0 }

        // Perform Chi-Square test
        val chiSquareTest = ChiSquareTest()
        val chiSquareStatistic = chiSquareTest.chiSquare(expectedCount, rollResults.map { it.toLong() }.toLongArray())

        // Calculate degrees of freedom
        val degreesOfFreedom = expectedCount.size - 1

        // Calculate critical value for significance level 0.05
        val criticalValue = org.apache.commons.math3.distribution.ChiSquaredDistribution(degreesOfFreedom.toDouble())
            .inverseCumulativeProbability(1.0 - 0.05)

        // Verify that the chi-square statistic is below the critical value
        assertTrue(
            chiSquareStatistic < criticalValue,
            "The dice rolls are not unbiased (chi-square statistic: $chiSquareStatistic, critical value: $criticalValue)"
        )
    }
}