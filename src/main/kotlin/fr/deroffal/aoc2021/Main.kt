package fr.deroffal.aoc2021

fun main() {
    val day01 = Day01("day01.txt".fileToInts())
    println(
        """
        Part 1 :         ${day01.part1()}
        Part 2 :         ${day01.part2()}
    """.trimIndent()
    )
}
