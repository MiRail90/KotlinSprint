package lesson_10

fun main() {
    println("Введите длину пароля ")
    val lengthPassword = 1..readln().toInt()
    println(generatePassword(lengthPassword))
}

fun generatePassword(lengthPassword: IntRange): String {
    val intRange = 0..9
    val specRange = 32..47
    var password = ""
    for (i in lengthPassword) {
        password = if (password.length % 2 == 0) {
            password.plus(intRange.random())
        } else {
            password.plus(specRange.random().toChar())
        }
    }
    return (password)
}