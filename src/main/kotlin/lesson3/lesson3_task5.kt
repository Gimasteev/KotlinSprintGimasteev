package org.example.lesson3


fun main() {
    val string = "D2-D4;0"
    val fromPlace = string.substring(0, 2)
    val toPlace = string.substring(3, 5)
    val numberOfMove = string.substring(6, 7)
    print("$fromPlace\n$toPlace\n$numberOfMove")
}