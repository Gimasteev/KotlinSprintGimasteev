package org.example.lesson4

const val TABLES = 13
fun main() {
    val reserveTablesToday = 13
    val reserveTablesTomorrow = 9
    val resultToday = reserveTablesToday < TABLES
    val resultTomorrow =  reserveTablesTomorrow < TABLES
    println("Доступность столиков на сегодня: $resultToday\nДоступность столиков на завтра: $resultTomorrow")
}