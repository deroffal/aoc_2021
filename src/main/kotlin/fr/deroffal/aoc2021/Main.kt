package fr.deroffal.aoc2021

fun main() {

    val day01 = Day01("day01.txt".fileToInts())
    println(
        """
        Day 01
        Part 1 :         ${day01.part1()}
        Part 2 :         ${day01.part2()}
    """.trimIndent()
    )

    val day02 = Day02("day02.txt".fileToStrings())
    println(
        """
        Day 02
        Part 1 :         ${day02.part1()}
        Part 2 :         ${day02.part2()}
    """.trimIndent()
    )

    val day03 = Day03("day03.txt".fileToStrings())
    println(
        """
        Day 03
        Part 1 :         ${day03.part1()}
    """.trimIndent()
    )
}
