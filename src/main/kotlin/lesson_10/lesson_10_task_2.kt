package lesson_10

fun main() {
    println("Введите логин ")
    val login = readln()
    println("Введите пароль ")
    val password = readln()
    if (checkLength(login) && checkLength(password)) println("Проверка пройдена")
    else println("Логин или пароль недостаточно длинные")
}

fun checkLength(strCheck: String): Boolean {
    return strCheck.length >= MINIMUM_LENGTH
}

const val MINIMUM_LENGTH = 4

