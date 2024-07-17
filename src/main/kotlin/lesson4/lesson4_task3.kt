package org.example.lesson4

const val AIR_HUMIDITY_INIT = 20
const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val SEASON = "winter"

fun main() {
    val airHumidity = 20
    val beans = IS_SUNNY && IS_AWNING_OPEN && airHumidity == AIR_HUMIDITY_INIT && SEASON != "winter"
    print("Благоприятные ли условия сейчас для роста бобовых? $beans")
}