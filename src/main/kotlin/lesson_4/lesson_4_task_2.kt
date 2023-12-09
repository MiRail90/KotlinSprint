package lesson_4

fun main() {
    val firstCargoWeight = 20
    val firstCargoVolume = 80

    val secondCargoWeight = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoWeight кг и объемом $firstCargoVolume л соответствует категории 'Average': ${firstCargoWeight > MIN_AVERAGE_WEIGHT && firstCargoWeight <= MAX_AVERAGE_WEIGHT && firstCargoVolume < MAX_AVERAGE_VOLUME}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${secondCargoWeight > MIN_AVERAGE_WEIGHT && secondCargoWeight <= MAX_AVERAGE_WEIGHT && secondCargoVolume < MAX_AVERAGE_VOLUME}")

}

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100