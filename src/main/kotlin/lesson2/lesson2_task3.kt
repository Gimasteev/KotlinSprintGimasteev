package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeStartHours = 9
    val timeStartMinutes = 39
    val timeTravellingMinutes = 457
    val timeEndHours = (timeStartMinutes + timeStartHours * MINUTES_IN_HOUR + timeTravellingMinutes) / MINUTES_IN_HOUR
    val timeEndMinutes = (timeStartMinutes + timeStartHours * MINUTES_IN_HOUR + timeTravellingMinutes) % MINUTES_IN_HOUR
    print("Время прибытия поезда = $timeEndHours:$timeEndMinutes")
}