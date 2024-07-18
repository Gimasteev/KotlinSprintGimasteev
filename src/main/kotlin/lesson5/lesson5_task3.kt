package org.example.lesson5

const val RIGHT_NUM_1 = 5
const val RIGHT_NUM_2 = 10

fun main() {
    println("Выберите число от 0 до 42. Введите первое число")
    val customerNumberFirst = readln().toInt()
    if (customerNumberFirst == RIGHT_NUM_1 || customerNumberFirst == RIGHT_NUM_2) {
        println("Вы угадали первое число! Попробуйте угадать второе! Введите второе число")
        val customerNumberSecond = readln().toInt()
        if ((customerNumberSecond == RIGHT_NUM_1 && customerNumberSecond != customerNumberFirst) || (customerNumberSecond == RIGHT_NUM_2 && customerNumberSecond != customerNumberFirst))
            println("Поздравляем! Вы выиграли главный приз!")
        else
            println("Вы выиграли утешительный приз!")
    } else {
        println("Вы не угадали первое число! Попробуйте угадать второе! Введите второе число")
        val customerNumberSecond = readln().toInt()
        if (customerNumberSecond == RIGHT_NUM_1 || customerNumberSecond == RIGHT_NUM_2)
            println("Вы выиграли утешительный приз!")
        else
            println("Неудача!")
    }

    println("Выйгрышные числа были $RIGHT_NUM_1 и $RIGHT_NUM_2")
}
