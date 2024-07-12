package org.example.lesson3

const val USER_NAME = "Роман"
const val HELLO_TEXT_DAY = "Добрый день, "
const val HELLO_TEXT_NIGHT = "Добрый вечер, "

fun main() {
    var allHelloText = HELLO_TEXT_DAY + USER_NAME
    println(allHelloText)
    allHelloText = HELLO_TEXT_NIGHT + USER_NAME
    println(allHelloText)
}