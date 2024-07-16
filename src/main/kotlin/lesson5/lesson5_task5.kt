package org.example.lesson5

import kotlin.random.Random

fun main() {
    val mutSetOfRandomNumbers = mutableSetOf<Int>()
    mutSetOfRandomNumbers.add(Random.nextInt(0, 42))
    mutSetOfRandomNumbers.add(Random.nextInt(0, 42))
    mutSetOfRandomNumbers.add(Random.nextInt(0, 42))
    val mutSetUser = mutableSetOf<Int>()
    println("Введите первое случайное число от 0 до 42")
    var stringInput = readln().toInt()
    mutSetUser.add(stringInput)
    println("Введите второе случайное число от 0 до 42")
    stringInput = readln().toInt()
    mutSetUser.add(stringInput)
    println("Введите третье случайное число от 0 до 42")
    stringInput = readln().toInt()
    mutSetUser.add(stringInput)
    val coincidences = mutSetOfRandomNumbers.intersect(mutSetUser)
    val sizeOfCoincidences = coincidences.size
    when (sizeOfCoincidences) {
        3 -> println("Джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вы угадали одно число и получаете утишительный приз")
        0 -> println("Вы не угадали ни одного числа :(")
    }
    println("Выйгрышные числа: $mutSetOfRandomNumbers")
}