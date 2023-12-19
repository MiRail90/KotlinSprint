package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь: ")
    val timeInSeconds = readln().toInt()
    val timeInMilliseconds: Long = (1000 * timeInSeconds).toLong()
    Thread.sleep(timeInMilliseconds)
    println("Прошло $timeInSeconds секунд/а/ы")
}