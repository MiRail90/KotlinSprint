package lesson_10

fun main() {
    val humanNumber = rollTheDice()
    println("Ход человека. Выпавшее число $humanNumber")
    val computerNumber = rollTheDice()
    println("Ход компьютера. Выпавшее число $computerNumber")
    if (humanNumber > computerNumber) println("Победило человечество")
    else
        if (humanNumber < computerNumber) println("Победила машина")
        else println("Победила дружба")
}
fun rollTheDice(): Int {
    val numberRange = 1..6
    return numberRange.random()
}