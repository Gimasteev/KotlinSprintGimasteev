package org.example.lesson4

const val CREW_SIZE_MIN = 55
const val CREW_SIZE_MAX = 70
const val BOX_SIZE = 50


fun main() {
    println("Наличие повреждений корпуса? (true/false)")
    val isDamaged = readln().toBoolean()
    println("Текущий состав экипажа")
    val numberOfCrew = readln().toInt()
    println("Количество ящиков с провизией на борту")
    val numberOfBoxes = readln().toInt()
    println("Хорошая погода? (true/false)")
    val isWeatherGood = readln().toBoolean()
    val result = (!isDamaged && numberOfCrew >= CREW_SIZE_MIN && numberOfCrew <= CREW_SIZE_MAX && numberOfBoxes > BOX_SIZE ) || (numberOfCrew == CREW_SIZE_MAX && numberOfBoxes >= BOX_SIZE && isWeatherGood)
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $result")
}