package org.example.lesson2

const val TIME_START = 579 // указал время старта в минутах
const val TIME_TRAVELLING = 457
const val MINUTES_IN_HOUR = 60

fun main() {
    val timeEndHours = (TIME_START + TIME_TRAVELLING) / MINUTES_IN_HOUR
    val timeEndMinutes = (TIME_START + TIME_TRAVELLING) % MINUTES_IN_HOUR
    print("Время прибытия поезда = $timeEndHours:$timeEndMinutes")
}