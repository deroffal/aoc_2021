package fr.deroffal.aoc2021

class Day03(private val diagnosticReport: List<String>) {

    private var reportLength = diagnosticReport.first().length

    fun part1(): Int {
        val gamaRateList = mutableListOf<Char>()
        val epsilonRateList = mutableListOf<Char>()

        (0 until reportLength).forEach { position ->
            val bytesAtPosition: List<Char> = diagnosticReport.map { it[position] }

            val mostCommonValue = getByteWithMostCommonValue(bytesAtPosition)
            val leastCommonValue = getByteWithLeastCommonValue(bytesAtPosition)

            gamaRateList.add(mostCommonValue)
            epsilonRateList.add(leastCommonValue)
        }

        val gamaRate: Int = Integer.parseInt(gamaRateList.joinToString(separator = ""), 2)
        val epsilonRate: Int = Integer.parseInt(epsilonRateList.joinToString(separator = ""), 2)
        return gamaRate * epsilonRate
    }


    private fun getByteWithMostCommonValue(bytes: List<Char>): Char {
        val occurenceByBit = bytes.groupingBy { it }.eachCount()
        val maxOccurences = occurenceByBit.values.maxOf { it }
        return occurenceByBit.filter { it.value == maxOccurences }.map { it.key }.first()
    }

    private fun getByteWithLeastCommonValue(bytes: List<Char>): Char {
        val occurenceByBit = bytes.groupingBy { it }.eachCount()
        val maxOccurences = occurenceByBit.values.minOf { it }
        return occurenceByBit.filter { it.value == maxOccurences }.map { it.key }.first()
    }

}
