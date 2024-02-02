package lesson_7

fun main() {
    println("Введите максимальную длину пароля не меньше 6: ")
    var max = readln().toInt()
    if (max < 6) max = 6
    val step = 1..max step 1
    var password = ""
    val numberRange = 0..9
    val charSmall = 'a'..'z'
    val charBig = 'A'..'Z'
    val selectType = mutableListOf(numberRange, charSmall, charBig)
    for (i in step) {
        val variant = selectType.random()
        if (variant == numberRange) {
            password = password.plus(numberRange.random())
            selectType.remove(numberRange)
            selectType.add(charSmall)
            selectType.add(charBig)
        }
        if (variant == charSmall) {
            password = password.plus(charSmall.random())
            selectType.remove(charSmall)
            selectType.add(numberRange)
            selectType.add(charBig)

        }
        if (variant == charBig) {
            password = password.plus(charBig.random())
            selectType.remove(charBig)
            selectType.add(numberRange)
            selectType.add(charSmall)
        }
    }
    println(password)
}