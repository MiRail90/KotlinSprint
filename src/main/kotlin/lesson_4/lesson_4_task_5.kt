package lesson_4

fun main() {
    println("Корабль поврежден?, введите (true или false):")
    val isDamagedShip: Boolean = readln().toBoolean()
    println("Введите количество экипажа:")
    val countCrew: Int = readln().toInt()
    println("Введите количество ящиков провизии:")
    val countBoxes: Int = readln().toInt()
    println("Благоприятная погода?, введите (true или false):")
    val isFavorableWeatherConditions: Boolean = readln().toBoolean()

    val isDamagedShipIdeal: Boolean = false
    val countCrewMinIdeal: Int = 55
    val countCrewMaxIdeal: Int = 70
    val countBoxesIdeal: Int = 50

    val countCrewSecondChance = 70
    val isFavorableWeatherConditionsSecondChance: Boolean = true
    val countBoxesSecondChance: Int = 50

    println("Корабль готов к плаванию: ${((isDamagedShip == isDamagedShipIdeal) && (countCrew in (countCrewMinIdeal..countCrewMaxIdeal)) && (countBoxes > countBoxesIdeal)) or ((isDamagedShip != isDamagedShipIdeal) && (countCrew == countCrewSecondChance) && (isFavorableWeatherConditions == isFavorableWeatherConditionsSecondChance) && (countBoxes >= countBoxesSecondChance))}")
}