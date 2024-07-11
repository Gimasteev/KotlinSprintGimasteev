package org.example.lesson2

import kotlin.math.roundToInt

const val CRYSTALLINE_ORE = 7
const val IRON_ORE = 11

fun main(){
    val crystalline_ore_by_buff:Double = CRYSTALLINE_ORE * 0.2
    val iron_ore_by_buff:Double = IRON_ORE * 0.2
    print("Бафф дает ${crystalline_ore_by_buff.roundToInt()} кристаллической руды и " +
            "${iron_ore_by_buff.roundToInt()} железной руды")
}