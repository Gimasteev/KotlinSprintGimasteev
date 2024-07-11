package org.example.lesson1

fun main() {
    val orderQuantity = 75
    val purchaseThankYouText = "Спасибо за покупку, хорошего дня!"
    println("Количество заказов = $orderQuantity\n$purchaseThankYouText")
    var numberOfEmployeesOfOnlineShop = 2000
    //print("Количество работников интернет-магазина = $numberOfEmployeesOfOnlineShop")
    numberOfEmployeesOfOnlineShop -= 1
    print("Количество работников интернет-магазина = $numberOfEmployeesOfOnlineShop")
}