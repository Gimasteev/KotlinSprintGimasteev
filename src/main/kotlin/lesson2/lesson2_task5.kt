package org.example.lesson2

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

const val START_SUMM = 70_000
const val YEAR_PERCENT = 0.167
const val INVESTMENT_PERIOD = 20

fun main() {
    val totalAmount: Double = START_SUMM * (1 + YEAR_PERCENT).pow(INVESTMENT_PERIOD)
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.DOWN
    print("Размер вклада через $INVESTMENT_PERIOD лет составит = ${df.format(totalAmount)}")
}