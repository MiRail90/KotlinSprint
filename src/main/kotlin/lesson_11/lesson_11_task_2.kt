package lesson_11

fun main() {
    val user1 = User2(1, "user1", "password1", "user1@mail.ru")
    user1.printAll()
    user1.writeToBio()
    user1.printAll()
    user1.changePassword()
    user1.printAll()
}

class User2(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val mail: String,
    private var bio: String = ""
) {
    fun printAll() {
        println(id)
        println(login)
        println(password)
        println(mail)
        println(bio)
    }

    fun writeToBio() {
        println("Введите информацию о себе")
        bio = readln()
    }

    fun changePassword() {
        println("Введите действующий пароль")
        if (password == readln()) {
            println("Введите новый пароль")
            password = readln()
            println("Пароль был изменен")
        } else {
            println("Пароль был введен не верно")
        }

    }
}