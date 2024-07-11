package org.example.lesson1

const val SECONDS_IN_SPACE = 6480
const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60
fun main() {
    val hours = SECONDS_IN_SPACE / SECONDS_IN_HOUR
    val minutes = (SECONDS_IN_SPACE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val lastSeconds = (SECONDS_IN_SPACE % SECONDS_IN_MINUTE) % SECONDS_IN_MINUTE
    println("$hours:$minutes:$lastSeconds")
}