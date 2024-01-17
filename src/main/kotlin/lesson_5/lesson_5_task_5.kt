package lesson_5


import kotlin.random.Random

fun main() {
    val winNumbers = List(3) { Random.nextInt(0, 42) }
    val userNumbers = mutableListOf<Int>()

    println("Введите первое число (от 0 до 42):")
    userNumbers.add(readln().toInt())
    println("Введите второе число (от 0 до 42):")
    userNumbers.add(readln().toInt())
    println("Введите третье число (от 0 до 42):")
    userNumbers.add(readln().toInt())

    val guessedNumbers = userNumbers.intersect(winNumbers)
    val gradeGift = guessedNumbers.size

    when (gradeGift) {
        3 -> println("Вы угадали все числа и выиграли джекпот")
        2 -> println("Вы угадали два числа и получаете крупный приз")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        0 -> println("Вы не угадали ни одного числа")
    }

    println("Победные числа $winNumbers")
}


