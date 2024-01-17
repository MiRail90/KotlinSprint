package lesson_7

fun main() {
    val numberRange = 0..9
    val charRange = 'a'..'z'
    val step: IntRange = 0..2
    var password = ""
    for (i in step) {
        password = password.plus(charRange.random()).plus(numberRange.random())
    }
    println(password)
}