package org.example.lesson2

import kotlin.math.roundToInt

const val ONE_HUNDRED_PERCENT = 100

fun main() {
    val crystallOre = 7
    val ironOre = 11
    val percentBuf = 20
    val crystallineOreByBuff: Double = crystallOre * percentBuf.toDouble() / ONE_HUNDRED_PERCENT
    val ironOreByBuff: Double = ironOre * percentBuf.toDouble() / ONE_HUNDRED_PERCENT
    print(
        "Бафф дает ${crystallineOreByBuff.roundToInt()} кристаллической руды и " +
                "${ironOreByBuff.roundToInt()} железной руды"
    )
}