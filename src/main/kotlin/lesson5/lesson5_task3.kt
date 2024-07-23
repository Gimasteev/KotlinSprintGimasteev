package org.example.lesson5

const val RIGHT_NUM_1 = 5
const val RIGHT_NUM_2 = 10

fun main() {
    println("Введите два числа от 0 до 42")
    val customerNumberFirst = readln().toInt()
    val customerNumberSecond = readln().toInt()

    if (customerNumberFirst == RIGHT_NUM_1 || customerNumberFirst == RIGHT_NUM_2) {
        if ((customerNumberSecond == RIGHT_NUM_1 && customerNumberSecond != customerNumberFirst) ||
            (customerNumberSecond == RIGHT_NUM_2 && customerNumberSecond != customerNumberFirst)
        )
            println("Поздравляем! Вы выиграли главный приз!")
        else
            println("Вы выиграли утешительный приз!")
    } else {
        if (customerNumberSecond == RIGHT_NUM_1 || customerNumberSecond == RIGHT_NUM_2)
            println("Вы выиграли утешительный приз!")
        else
            println("Неудача!")
    }

    println("Выйгрышные числа были $RIGHT_NUM_1 и $RIGHT_NUM_2")
}
