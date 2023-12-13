package lesson_5

fun main() {
    val firsWinNumber = 5
    val secondWinNumber = 32
    var giftLevel = 0

    println("Введите первое число (от 0 до 42):")
    val playerFirstNumber = readln().toInt()

    println("Введите второе число (от 0 до 42):")
    val playerSecondNumber = readln().toInt()


    if (playerFirstNumber == firsWinNumber || playerFirstNumber == secondWinNumber) giftLevel++
    if (playerSecondNumber == firsWinNumber || playerSecondNumber == secondWinNumber) giftLevel++

    if (playerFirstNumber == playerSecondNumber) giftLevel-- //Проверка, если пользователь ввел два одинаковых числа и одно из чисел совпало с победным

    if ((firsWinNumber == secondWinNumber) && (playerFirstNumber == playerSecondNumber)) giftLevel++ //Если организатор все же решил задумать два выиграшных числа одинаковыми и ввел их firsWinNumber и secondWinNumber, также если два числа введены неверно и они одинаковы и организатор задумал одинаковые -  на предыдущем шаге giftLevel будет равен "-1"


    when (giftLevel) {
        -1 -> println("Неудача!") //Если ввели два одинаковых числа и оно не выигрышное
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")

    }
    println("Победные числа $firsWinNumber и $secondWinNumber")

}