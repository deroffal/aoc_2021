package fr.deroffal.aoc2021

import io.kotest.matchers.ints.shouldBeExactly
import org.junit.jupiter.api.Test

internal class Day02Test {

    private val day02 = Day02(
        listOf(
            "forward 5",
            "down 5",
            "forward 8",
            "up 3",
            "down 8",
            "forward 2"
        )
    )

    @Test
    fun `part1 should return 150`(){
        day02.part1() shouldBeExactly 150
    }

    @Test
    fun `part2 should return 900`(){
        day02.part2() shouldBeExactly 900
    }
}
