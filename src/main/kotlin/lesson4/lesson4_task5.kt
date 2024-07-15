package org.example.lesson4

const val CREW_SIZE_MIN = 55
const val CREW_SIZE_MAX = 70
const val BOX_SIZE = 50


fun main() {
    println("Наличие повреждений корпуса? (Y/N)")
    val shipBody = readLine()
    println("Текущий состав экипажа")
    val crew = readLine()!!.toInt()
    println("Количество ящиков с провизией на борту")
    val box = readLine()!!.toInt()
    println("Хорошая погода? (Y/N)")
    val weather = readLine()
    val result = (shipBody == "N" && crew >= CREW_SIZE_MIN && crew <= CREW_SIZE_MAX && box > CREW_SIZE_MIN && (weather == "Y" || weather == "N")) || (shipBody == "Y" && crew == CREW_SIZE_MAX && box >= BOX_SIZE && weather == "Y")
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $result")
}