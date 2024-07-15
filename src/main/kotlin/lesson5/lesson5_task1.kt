package org.example.lesson5

fun main() {
    println("Введите решение уравнения 2 + 2")
    val result = readln().toInt()
    if (result == 4)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}