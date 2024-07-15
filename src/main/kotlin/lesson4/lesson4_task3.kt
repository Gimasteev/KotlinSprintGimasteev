package org.example.lesson4

fun main() {
    val weatherToday = "sunny"
    val awning = true
    val airHumidity = 20
    val season = "winter"
    val beans = weatherToday == "sunny" && awning && airHumidity == 20 && season != "winter"
    print("Благоприятные ли условия сейчас для роста бобовых? $beans")
}