package lesson_11

fun main() {
    val user1 = User(1, "user1", "password1", "user1@mail.ru")
    val user2 = User(2, "user2", "password2", "user2@mail.ru")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.mail)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.mail)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
)