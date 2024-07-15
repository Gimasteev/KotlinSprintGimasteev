package org.example.lesson2

import kotlin.math.roundToInt

fun main() {
    val oneHundredPersent = 100
    val crystallOre = 7
    val ironOre = 11
    val percentBuf = 20
    val crystallineOreByBuff: Double = crystallOre * percentBuf.toDouble() / oneHundredPersent
    val ironOreByBuff: Double = ironOre * percentBuf.toDouble() / oneHundredPersent
    print(
        "Бафф дает ${crystallineOreByBuff.roundToInt()} кристаллической руды и " +
                "${ironOreByBuff.roundToInt()} железной руды"
    )
}