package org.example.lesson3

const val STRING = "D2-D4;0"

fun main() {
    val fromPlace = STRING.substring(0, 2)
    val toPlace = STRING.substring(3, 5)
    val numberOfmove = STRING.substring(6, 7)
    print("$fromPlace\n$toPlace\n$numberOfmove")
}