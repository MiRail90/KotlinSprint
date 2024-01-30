package lesson_7


fun main() {
    println("Введите последнее число:")
    val finalNumber = readln().toInt()
    val numberRange = 0..finalNumber step 2

    for (i in numberRange) {
        println(i)
    }

}