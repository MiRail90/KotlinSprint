package lesson_5

fun main() {
    val firstWinNumber = 5
    val secondWinNumber = 32
    var giftLevel: String = ""

    println("Введите первое число (от 0 до 42):")
    val playerFirstNumber = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val playerSecondNumber = readln().toInt()



    if ((playerFirstNumber == firstWinNumber || playerFirstNumber == secondWinNumber) && (playerSecondNumber == firstWinNumber || playerSecondNumber == secondWinNumber) && (((firstWinNumber == secondWinNumber) && (playerFirstNumber == playerSecondNumber)) || ((firstWinNumber != secondWinNumber) && (playerFirstNumber != playerSecondNumber))))  //вся сложность у меня возникла: если организатором были задуманы разные числа а игроком были введены два одинаковых числа - поэтому такой длинный код у меня получился
        giftLevel = "Поздравляем! Вы выиграли главный приз!"
    else if (playerFirstNumber == firstWinNumber || playerFirstNumber == secondWinNumber || playerSecondNumber == firstWinNumber || playerSecondNumber == secondWinNumber)
        giftLevel = "Вы выиграли утешительный приз!"
    else giftLevel = "Неудача!"




    println(giftLevel)
    println("Победные числа $firstWinNumber и $secondWinNumber")

}


