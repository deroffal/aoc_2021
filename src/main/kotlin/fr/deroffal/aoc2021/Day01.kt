package fr.deroffal.aoc2021

class Day01(private val report: List<Int>) {

    fun part1() = report.countIncreasing()

    fun part2() = report
        .windowed(3, 1) { it.sum() }
        .countIncreasing()

    private fun List<Int>.countIncreasing() = this.zipWithNext().count { it.first < it.second }

}
