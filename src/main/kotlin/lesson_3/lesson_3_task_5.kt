package lesson_3

fun main() {
    val stepFromPlayer: String = "D2-D4;0"
    var fromWhere: String? = null
    var toWhere: String? = null
    var step: String? = null


    val splitResponseFromPlayer: List<String> = stepFromPlayer.split("-", ";")

    fromWhere = splitResponseFromPlayer[0]
    toWhere = splitResponseFromPlayer[1]
    step = splitResponseFromPlayer[2]

    println(fromWhere)
    println(toWhere)
    println(step)

}

