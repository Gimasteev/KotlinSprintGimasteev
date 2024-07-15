package org.example.lesson4

fun main() {
    println("Наличие повреждений корпуса? (Y/N)")
    val shipBody = readLine()
    println("Текущий состав экипажа")
    val crew = readLine()!!.toInt()
    println("Количество ящиков с провизией на борту")
    val box = readLine()!!.toInt()
    println("Хорошая погода? (Y/N)")
    val weather = readLine()
    val result = (shipBody == "N" && crew >= 55 && crew <= 70 && box > 50 && (weather == "Y" || weather == "N")) || (shipBody == "Y" && crew == 70 && box >= 50 && weather == "Y")
    println("Научно-исследовательский корабль может приступить к долгосрочному плаванию: $result")
}