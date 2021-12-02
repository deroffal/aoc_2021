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

            val forward: Int = getOrElse("forward") { 0 }

            return forward * (down-up )
        }


}
