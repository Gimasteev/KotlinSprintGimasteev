package org.example.lesson2

fun main() {
    val salariesOfPermanentEmployees = 30000
    val salariesOfInterns = 20000
    val numberOfInterns = 30
    val numberOfPermanentEmployees = 50

    val expenditureOfPermanentEmployees = salariesOfPermanentEmployees * numberOfPermanentEmployees
    println("Расходы на выплату зарплаты постоянных сотрудников = $expenditureOfPermanentEmployees")
    val expenditureAll = salariesOfPermanentEmployees * numberOfPermanentEmployees +
            salariesOfInterns * numberOfInterns
    println("Общие расходы по ЗП = $expenditureAll")
    val averageSalaryOfOneEmployee = expenditureAll / (numberOfInterns + numberOfPermanentEmployees)
    print("Средняя ЗП одного сотрудника = $averageSalaryOfOneEmployee")
}