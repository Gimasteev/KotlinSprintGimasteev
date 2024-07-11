package org.example.lesson2

const val TIME_START = 579 // указал время старта в минутах
const val TIME_TRAVELLING = 457

fun main(){
    val time_end_hours = (TIME_START + TIME_TRAVELLING) / 60
    val time_end_minutes = (TIME_START + TIME_TRAVELLING) % 60
    print("Время прибытия поезда = $time_end_hours:$time_end_minutes")
}