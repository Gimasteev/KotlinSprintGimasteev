package org.example.lesson1
//Секунды – 6480
fun main(){
    val seconds = 6480
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val last_seconds = (seconds % 60) % 60
    println("$hours:$minutes:$last_seconds")
}