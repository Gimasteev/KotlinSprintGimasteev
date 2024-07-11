package org.example.lesson2

const val SALARIES_OF_PERMANENT_EMPLOYEES = 30000
const val SALARIES_OF_INTERNS = 20000
const val NUMBER_OF_INTERNS = 30
const val NUMBER_OF_PERMANENT_EMPLOYEES = 50

fun main() {
    val expenditure_of_permanent_employees = SALARIES_OF_PERMANENT_EMPLOYEES * NUMBER_OF_PERMANENT_EMPLOYEES
    println("Расходы на выплату зарплаты постоянных сотрудников = $expenditure_of_permanent_employees")
    val expenditure_all = SALARIES_OF_PERMANENT_EMPLOYEES * NUMBER_OF_PERMANENT_EMPLOYEES +
            SALARIES_OF_INTERNS * NUMBER_OF_INTERNS
    println("Общие расходы по ЗП = $expenditure_all")
    val average_salary_of_one_employee = expenditure_all / (NUMBER_OF_INTERNS + NUMBER_OF_PERMANENT_EMPLOYEES)
    print("Средняя ЗП одного сотрудника = $average_salary_of_one_employee")
}