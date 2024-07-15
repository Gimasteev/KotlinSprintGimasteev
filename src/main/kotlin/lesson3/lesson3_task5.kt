package org.example.lesson3

const val STRING = "D2-D4;0"

fun main() {
    val split = STRING.split("-", ";")
    println(split[0])
    println(split[1])
    println(split[2])
}