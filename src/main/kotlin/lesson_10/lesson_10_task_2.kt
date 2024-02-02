package lesson_10

fun main() {
    println("Введите логин ")
    val login = readln()
    println("Введите пароль ")
    val password = readln()
    if (checkLength(login, password)) println("Проверка пройдена")
    else println("Логин или пароль недостаточно длинные")
}

fun checkLength(login: String, password: String): Boolean {
    return login.length >= MINIMUM_LENGTH && password.length >= MINIMUM_LENGTH
}

const val MINIMUM_LENGTH = 4

