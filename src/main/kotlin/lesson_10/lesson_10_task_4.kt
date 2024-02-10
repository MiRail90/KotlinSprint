package lesson_10

fun main() {
    var numberOfPersonWinnings = 0
    var game = "Да"
    while (game == "Да") {
        if (round()) numberOfPersonWinnings++
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        game = readln()
    }
    println("Количество Ваших выигрышей: $numberOfPersonWinnings")
}

fun round(): Boolean {
    val humanNumber = rollTheDice()
    println("Ход человека. Выпавшее число $humanNumber")
    val computerNumber = rollTheDice()
    println("Ход компьютера. Выпавшее число $computerNumber")
    return if (humanNumber > computerNumber) {
        println("Победило человечество")
        true
    } else
        if (humanNumber < computerNumber) {
            println("Победила машина")
            false
        } else {
            println("Победила дружба")
            false
        }
}

fun rollTheDice(): Int {
    val numberRange = 1..6
    return numberRange.random()
}