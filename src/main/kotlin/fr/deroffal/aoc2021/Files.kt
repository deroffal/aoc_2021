package fr.deroffal.aoc2021

import java.io.File

fun String.fileToStrings() = File(ClassLoader.getSystemResource(this).toURI()).readLines()
fun String.fileToInts() = this.fileToStrings().map { it.toInt() }
