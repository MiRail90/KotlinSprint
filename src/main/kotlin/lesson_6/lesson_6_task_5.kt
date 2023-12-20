package lesson_6

import kotlin.random.Random

fun main() {
    var numberOfChance = 3
    var firstNumber: Int
    var secondNumber: Int
    var userAnswer: Int

    while (numberOfChance > 0) {
        firstNumber = Random.nextInt(1, 9)
        secondNumber = Random.nextInt(1, 9)
        println("Решите пример для входа: $firstNumber + $secondNumber= ")
        userAnswer = readln().toInt()
        if ((firstNumber + secondNumber) == userAnswer) {
            println("Добро пожаловать!")
            break
        } else println("Попробуйте решить еще раз. Осталось попыток ${--numberOfChance}")
    }
    if (numberOfChance == 0) println("Доступ запрещен")
}