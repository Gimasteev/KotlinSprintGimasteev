package org.example.lesson2

import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.pow

const val ONE_HUNDRED_PERCENT = 100.0

fun main() {
    val startSum = 70_000
    val yearPercent = 16.7
    val investmentPeriod = 20
    val totalAmount: Double = startSum * (1 + yearPercent / ONE_HUNDRED_PERCENT).pow(investmentPeriod)
    val df = DecimalFormat("#.###")
    df.roundingMode = RoundingMode.DOWN
    print("Размер вклада через $investmentPeriod лет составит = ${df.format(totalAmount)}")
}