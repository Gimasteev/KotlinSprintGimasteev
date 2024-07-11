package org.example.lesson2

import kotlin.math.roundToInt

const val CRYSTALLINE_ORE = 7
const val IRON_ORE = 11
const val TWENTY_PERSENT = 0.2

fun main() {
    val crystallineOreByBuff: Double = CRYSTALLINE_ORE * TWENTY_PERSENT
    val ironOreByBuff: Double = IRON_ORE * TWENTY_PERSENT
    print(
        "Бафф дает ${crystallineOreByBuff.roundToInt()} кристаллической руды и " +
                "${ironOreByBuff.roundToInt()} железной руды"
    )
}