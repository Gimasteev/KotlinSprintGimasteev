package org.example.lesson3

const val USER_NAME = "Роман"
fun main() {
    val helloTextDay = "Добрый день"
    val helloTextNight = "Добрый вечер"
    var allHelloText = "$helloTextDay, $USER_NAME"
    println(allHelloText)
    allHelloText = "$helloTextNight, $USER_NAME"
    println(allHelloText)
}