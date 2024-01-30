package lesson_7

fun main() {
    val codeRange = 1000..9999
    val numberOfAttempts = 2 downTo 0 //количество попыток 3
    for (i in numberOfAttempts) {
        val code = codeRange.random()
        println("Ваш код авторизации: $code")
        println("Введите код из смс")
        val userCode = readln().toInt()
        if (userCode == code) {
            println("Здравствуйте, вы ввели верный код")
            break
        } else println("Вы ввели неверный код. Осталось попыток $i")
    }
}