package org.example.lesson3

const val AGE_BEFORE = 20
const val AGE_AFTER = 22
const val SURNAME_BEFORE = "Андреева"
const val SURNAME_AFTER = "Сидорова"
const val NAME = "Татьяна"
const val PATRONYMIC = "Сергеевна"

fun main() {
    println("$SURNAME_BEFORE $NAME $PATRONYMIC, $AGE_BEFORE")
    print("$SURNAME_AFTER $NAME $PATRONYMIC, $AGE_AFTER")
}