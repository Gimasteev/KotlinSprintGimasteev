package org.example.lesson5

const val MAJORITY = 18
const val NOW_YEAR = 2024

fun main() {
    println("Введите год рождения")
    val age = readln().toInt()
    if (NOW_YEAR - age >= MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Доступ закрыт")
}