package org.example.lesson_2

fun main() {
    val employees = 50
    val salaryPerEmployee = 30000
    val interns = 30
    val salaryPerIntern = 20000

    val expensesOnEmployees = employees * salaryPerEmployee
    val totalExpenses = (employees * salaryPerEmployee) + (interns * salaryPerIntern)
    val averageSalaryPerEmployee = (totalExpenses.toDouble() / (employees + interns)).toInt()

    println("Расходы на выплату зарплаты постоянных сотрудников: $expensesOnEmployees")
    println("Общие расходы по ЗП после прихода стажеров: $totalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryPerEmployee")





}