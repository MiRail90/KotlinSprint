package lesson_6

import kotlin.random.Random


fun main() {
    val winNumber = Random.nextInt(1, 9)
    var numberOfChances = 5
    var userWinNumber: Int

    while (numberOfChances > 0) {
        println("Введите цифру от 1 до 9:")
        userWinNumber = readln().toInt()
        if (winNumber == userWinNumber) {
            println("Это была великолепная игра!")
            numberOfChances = 0
        } else {
            println("Неверно. Оставшееся количество попыток ${--numberOfChances}")
        }
    }
    println("Было загадано число $winNumber")
}