package lesson_2


import kotlin.math.pow

fun main() {
    val depositOfMoney: Double = 70000.0
    val interestRate: Double = 16.7
    val timeToInvest: Int = 20
    val percentCoefficient: Byte = 100
    val beginCoefficient: Byte = 1

    val totalAmount: Double = depositOfMoney * (beginCoefficient + interestRate / percentCoefficient).pow(timeToInvest)

    println("За 20 лет вы накопите: %.3f".format(totalAmount))
}


