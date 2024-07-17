package org.example.lesson5

const val FIRST_NUM = 2
const val SECOND_NUM = 3

fun main() {
    println("Введите решение уравнения: $FIRST_NUM + $SECOND_NUM")
    val result = readln().toInt()
    if (result == FIRST_NUM + SECOND_NUM)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}