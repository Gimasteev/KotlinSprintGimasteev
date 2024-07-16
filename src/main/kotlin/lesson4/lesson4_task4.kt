package org.example.lesson4

fun main() {
    val dayOfTraining = readln().toInt()
    val isEven = dayOfTraining % 2 == 0
    println(
        """
        Упражнения для рук: ${!isEven}
        Упражнения для ног: $isEven
        Упражнения для спины: $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )
}