package fr.deroffal.aoc2021

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

internal class Day03Test {

    private val day03 = Day03(
        listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010"
        )
    )

    @Test
    fun `part1 should return 198`() {
        day03.part1() shouldBeExactly 198
    }
}
