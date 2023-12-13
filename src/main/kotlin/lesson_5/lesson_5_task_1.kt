package lesson_5

fun main() {
    val numberOne = 7
    val numberTwo = 2
    val sumOfNumbers = numberOne + numberTwo

    println("Решите это задание, докажите, что вы не робот: $numberOne+$numberTwo=")
    val responseFromUser = readln().toInt()

    if (sumOfNumbers == responseFromUser) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}