package lesson_7

fun main() {
    println("Введите максимальную длину пароля не меньше 6: ")
    var max = readln().toInt()
    if (max < 6) max = 6
    val step = 1..max - 3 step 1
    val numberRange = 0..9
    val charSmall = 'a'..'z'
    val charBig = 'A'..'Z'
    val allSymbols = numberRange.joinToString(separator = "").plus(charSmall.joinToString(separator = ""))
        .plus(charBig.joinToString(separator = ""))
    var password: String = numberRange.random().toString().plus(charSmall.random()).plus(charBig.random())
    for (i in step) {
        password = password.plus(allSymbols.random())
    }
    println(password)
}