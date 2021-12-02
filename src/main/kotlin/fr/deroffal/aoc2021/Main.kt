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
        Part 1 :         ${day02.part1()}
    """.trimIndent()
    )
}
