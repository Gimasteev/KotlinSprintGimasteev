package org.example.lesson2

const val SALARIES_OF_PERMANENT_EMPLOYEES = 30000
const val SALARIES_OF_INTERNS = 20000
const val NUMBER_OF_INTERNS = 30
const val NUMBER_OF_PERMANENT_EMPLOYEES = 50

fun main() {
    val expenditureOfPermanentEmployees = SALARIES_OF_PERMANENT_EMPLOYEES * NUMBER_OF_PERMANENT_EMPLOYEES
    println("Расходы на выплату зарплаты постоянных сотрудников = $expenditureOfPermanentEmployees")
    val expenditureAll = SALARIES_OF_PERMANENT_EMPLOYEES * NUMBER_OF_PERMANENT_EMPLOYEES +
            SALARIES_OF_INTERNS * NUMBER_OF_INTERNS
    println("Общие расходы по ЗП = $expenditureAll")
    val averageSalaryOfOneEmployee = expenditureAll / (NUMBER_OF_INTERNS + NUMBER_OF_PERMANENT_EMPLOYEES)
    print("Средняя ЗП одного сотрудника = $averageSalaryOfOneEmployee")
}