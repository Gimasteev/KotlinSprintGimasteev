package org.example.lesson5

const val LOGIN = "Zaphod"
const val PASS = "PanGalactic"

fun main() {
    println("Печальный запрос имя пользователя для входа в систему")
    val askLogin = readln()
    if (askLogin == LOGIN) {
        println("Печальный запрос пароля для входа в систему")
        val askPass = readln()
        if (askPass == PASS)
            println(
                """
                [вздыхает...] Ваши данные проверены, и о, чудо, они верны...
                 Пользователь "Zaphod", вам разрешено входить на борт
                 корабля "Heart of Gold". Хотя мне всё равно... Ну вперед,
                 войдите... Если вам так уж надо, в конце концов...
                 [меланхолический вздох...] Надеюсь, вам понравится
                 пребывание здесь больше, чем мне.
            """.trimIndent()
            )
        else
            println("Пароль неверный")
    } else {
        println("Пожалуйста, зарегистрируйтесь в системе")
        return
    }
}