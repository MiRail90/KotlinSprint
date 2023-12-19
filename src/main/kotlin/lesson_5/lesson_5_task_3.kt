package lesson_5

fun main() {
    val firstWinNumber = 5
    val secondWinNumber = 32

    println("Введите первое число (от 0 до 42):")
    val playerFirstNumber = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val playerSecondNumber = readln().toInt()

    if ((playerFirstNumber == firstWinNumber && playerSecondNumber == secondWinNumber) || (playerFirstNumber == secondWinNumber && playerSecondNumber == firstWinNumber))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (playerFirstNumber == firstWinNumber || playerFirstNumber == secondWinNumber || playerSecondNumber == firstWinNumber || playerSecondNumber == secondWinNumber)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Победные числа $firstWinNumber и $secondWinNumber")

}


