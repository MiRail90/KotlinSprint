package lesson_4

fun main() {
    println("Корабль поврежден?, введите (true или false):")
    val undamagedShip: Boolean = readLine()!!.toBoolean()
    println("Введите количество экипажа:")
    val countCrew: Int = readLine()!!.toInt()
    println("Введите количество ящиков провизии:")
    val countBoxes: Int = readLine()!!.toInt()
    println("Благоприятная погода?, введите (true или false):")
    val favorableWeatherConditions: Boolean = readLine()!!.toBoolean()

    val idealUndamagedShip: Boolean = true
    val idealCountCrewMin: Int = 55
    val idealCountCrewMax: Int = 70
    val idealCountBoxes: Int = 50

    val secondChanceCountCrew = 70
    val secondChanceFavorableWeatherConditions: Boolean = true
    val secondChanceCountBoxes: Int = 50

    println("Корабль готов к плаванию: ${((undamagedShip == idealUndamagedShip) && (countCrew in (idealCountCrewMin..idealCountCrewMax)) && (countBoxes > idealCountBoxes)) or ((undamagedShip != idealUndamagedShip) && (countCrew == secondChanceCountCrew) && (favorableWeatherConditions == secondChanceFavorableWeatherConditions) && (countBoxes >= secondChanceCountBoxes))}")
}