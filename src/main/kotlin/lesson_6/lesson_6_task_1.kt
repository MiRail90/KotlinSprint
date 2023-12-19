package lesson_6

fun main() {
    println("Регистрация: Придумайте логин:")
    val userLogin = readln()
    println("Регистрация: Придумайте пароль:")
    val userPassword = readln()
    do {
        println("Пройдите авторизацию:введите логин:")
        val _userLogin = readln()
        println("Пройдите авторизацию:введите пароль:")
        val _userPassword = readln()
    } while (!((userLogin == _userLogin) && (userPassword == _userPassword)))

    println("Авторизация прошла успешно")
}

