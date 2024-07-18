package org.example.lesson5

fun main() {
    val mutSetOfRandomNumbers = mutableSetOf<Int>()
    mutSetOfRandomNumbers.add((0..42).random())
    mutSetOfRandomNumbers.add((0..42).random())
    mutSetOfRandomNumbers.add((0..42).random())
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
    when (coincidences.size) {
        3 -> println("Джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вы угадали одно число и получаете утишительный приз")
        0 -> println("Вы не угадали ни одного числа :(")
    }
    println("Выигрышные числа: $mutSetOfRandomNumbers")
}