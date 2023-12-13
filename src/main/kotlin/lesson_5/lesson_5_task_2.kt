package lesson_5

fun main() {
    println("Введите год рождения:")
    val userYearOfBirth: Int = readln().toInt()
    val currentYear: Int = 2023
    val resultText: String =
        if ((currentYear - userYearOfBirth) >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
        else "Доступ запрещен к экрану со скрытым контентом"

    println(resultText)
}

const val AGE_OF_MAJORITY = 18