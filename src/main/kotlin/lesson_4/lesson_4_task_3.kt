package lesson_4

fun main() {
    val sunny: Boolean = true
    val tent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunny == IDEAL_SUNNY && tent == IDEAL_TENT && airHumidity == IDEAL_AIR_HUMIDITY && season != NOT_IDEAL_SEASON}")


}

const val IDEAL_SUNNY: Boolean = true
const val IDEAL_TENT: Boolean = true
const val IDEAL_AIR_HUMIDITY: Int = 20
const val NOT_IDEAL_SEASON: String = "зима"
