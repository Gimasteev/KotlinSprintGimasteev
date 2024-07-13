package org.example.lesson2

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeStartHours = 9
    var timeStartMinutes = 39
    timeStartMinutes = timeStartHours * MINUTES_IN_HOUR + 39
    val timeTravelling = 457
    val timeEndHours = (timeStartMinutes + timeTravelling) / MINUTES_IN_HOUR
    val timeEndMinutes = (timeStartMinutes + timeTravelling) % MINUTES_IN_HOUR
    print("Время прибытия поезда = $timeEndHours:$timeEndMinutes")
}