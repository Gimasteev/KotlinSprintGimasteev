package org.example.lesson4

const val MAX_LOAD_KG = 100
const val MIN_LOAD_KG = 35
const val MAX_VOLUME_L = 100

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80
    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': ${(firstCargoWeight > MIN_LOAD_KG) and (firstCargoWeight <= MAX_LOAD_KG) and (firstCargoVolume < MAX_VOLUME_L)}")
    val secondCargoWeight = 50
    val secondCargoVolume = 100
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${secondCargoWeight > MIN_LOAD_KG && secondCargoWeight <= MAX_LOAD_KG && secondCargoVolume < MAX_VOLUME_L}")
}