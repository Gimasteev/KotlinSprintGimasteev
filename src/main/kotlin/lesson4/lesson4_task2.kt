package org.example.lesson4

const val MAX_LOAD_KG = 100
const val MIN_LOAD_KG = 35
const val MAX_VOLUME_L = 100

fun main() {
    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > MIN_LOAD_KG) and (weight <= MAX_LOAD_KG) and (volume < MAX_VOLUME_L)}")
    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > MIN_LOAD_KG) and (weight <= MAX_LOAD_KG) and (volume < MAX_VOLUME_L)}")
}