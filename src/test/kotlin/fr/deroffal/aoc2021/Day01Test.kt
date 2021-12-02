package fr.deroffal.aoc2021

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

internal class Day01Test {

    private val day01 = Day01(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))

    @Test
    fun `part1 should return 7 for the example`() {
        //when :
        val increasingDepthMeasurements = day01.part1()

        //then :
        increasingDepthMeasurements shouldBeExactly 7
    }

    @Test
    fun `part2 should return 5 for the example`() {
        //when :
        val increasingDepthMeasurements = day01.part2()

        //then :
        increasingDepthMeasurements shouldBeExactly 5
    }

}
