package org.example.lesson5

import java.time.Year

const val MAJORITY = 18

fun main() {
    val currentYear = Year.now().value
    println("Введите год рождения")
    val age = readln().toInt()
    if (currentYear - age >= MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ закрыт")
}



