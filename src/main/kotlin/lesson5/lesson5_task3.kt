package org.example.lesson5

const val RIGHT_NUM_1 = 5
const val RIGHT_NUM_2 = 10

fun main() {
    println("Выберите число от 0 до 42")
    println("Введите первое число")
    val customerNumberFirst = readln().toInt()
    println("Введите второе число меньше $customerNumberFirst")
    val customerNumberSecond = readln().toInt()
    if (customerNumberSecond > customerNumberFirst) {
        println("Второе число меньше первого. Повторите игру вновь.")
        return
    }
    if ((customerNumberFirst == RIGHT_NUM_1 || customerNumberFirst == RIGHT_NUM_2) && (customerNumberSecond == RIGHT_NUM_1 || customerNumberSecond == RIGHT_NUM_2))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((customerNumberFirst == RIGHT_NUM_1 || customerNumberFirst == RIGHT_NUM_2) || (customerNumberSecond == RIGHT_NUM_1 || customerNumberSecond == RIGHT_NUM_2))
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")
}