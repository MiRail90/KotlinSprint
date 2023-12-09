package lesson_3

fun main() {
    var stepFromPlayer: String = "D2-D4;0"
    var fromWhere: String? = null
    var toWhere: String? = null
    var step: String? = null

    fromWhere = stepFromPlayer[0].toString() + stepFromPlayer[1].toString()
    toWhere = stepFromPlayer[3].toString() + stepFromPlayer[4].toString()
    step = stepFromPlayer[6].toString()

    println(fromWhere)
    println(toWhere)
    println(step)

}