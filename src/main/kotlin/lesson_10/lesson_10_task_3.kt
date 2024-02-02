package lesson_10

fun main() {
    println("Введите длину пароля ")
    val maxLength: Int = readln().toInt()
    val lengthPassword = 1..maxLength
    val password = generatePassword(lengthPassword)
    println(password)
}
fun generatePassword(lengthPassword: IntRange): String {
    val intRange = 0..9
    val specRange = "!\"#$%&'()*+,-./ "
    var password = ""
    var digit = true
    for (i in lengthPassword) {
        if (digit) {
            password = password.plus(intRange.random())
            digit = false
        } else {
            password = password.plus(specRange.random())
            digit = true
        }
    }
    return (password)
}