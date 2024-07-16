package org.example.lesson4

const val AIR_HUMIDITY_INIT = 20

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "winter"
    val beans = isSunny && isAwningOpen && airHumidity == AIR_HUMIDITY_INIT && season != "winter"
    print("Благоприятные ли условия сейчас для роста бобовых? $beans")
}