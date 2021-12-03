package fr.deroffal.aoc2021

class Day02(private val instructions: List<String>) {

    private val regex = Regex("([A-Za-z]+) (\\d)")

    fun part1(): Int = instructions
        .map { regex.find(it)!!.groups }
        .groupingBy { it[1]!!.value }
        .fold(0) { agregator, mgc: MatchGroupCollection -> agregator + mgc[2]!!.value.toInt() }
        .run {
            val up: Int = getOrElse("up") { 0 }
            val down: Int = getOrElse("down") { 0 }

            val position: Int = getOrElse("forward") { 0 }
            val depth = down - up

            return position * depth
        }

    fun part2(): Int {
        var depth = 0
        var position = 0
        var aim = 0

        instructions
            .map { regex.find(it)!!.groups }
            .map { it[1]!!.value to it[2]!!.value.toInt() }
            .forEach {
                when (it.first) {
                    "up" -> {
                        aim -= it.second
                    }
                    "down" -> {
                        aim += it.second
                    }
                    "forward" -> {
                        position += it.second
                        depth += aim * it.second
                    }
                    else -> throw IllegalArgumentException(it.first)
                }
            }
        return position * depth
    }

}
