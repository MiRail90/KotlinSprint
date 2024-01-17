package lesson_7

fun main() {
    val timeInMilliseconds = 1000L
    println("Введите количество секунд, которые нужно засечь:")
    val countSeconds = readln().toInt()
    val secondsRange = countSeconds downTo 0 step 1

    for (i in secondsRange) {
        println("Осталось $i секунд")
        Thread.sleep(timeInMilliseconds)
    }
    println("Время вышло")
}