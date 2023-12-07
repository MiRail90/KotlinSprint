package lesson_2

fun main() {
    val countEmployee: Byte = 50
    val salaryEmployee: Short = 30000
    val countTrainee: Byte = 30
    val salaryTrainee: Short = 20000

    val totalSalaryEmployee = salaryEmployee * countEmployee
    val totalSalary = countTrainee * salaryTrainee + totalSalaryEmployee
    val averageSalary: Float = totalSalary / (countEmployee + countTrainee).toFloat()

    println(
        """
        Расходы на выплату зарплаты постоянных сотрудников: $totalSalaryEmployee 
        Общие расходы по ЗП после прихода стажеров: $totalSalary 
        Средняя ЗП одного сотрудника: $averageSalary
        """.trimIndent()
    )
}