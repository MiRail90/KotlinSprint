package lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь: ")
    var timeInSeconds = readln().toInt()

    while (timeInSeconds > 0) {
        println("Осталось секунд:${timeInSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")

}