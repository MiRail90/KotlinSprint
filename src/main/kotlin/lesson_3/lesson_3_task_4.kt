package lesson_3


fun main() {
    var fromWhere: String = "E2"
    var toWhere: String = "E4"
    var step: Int = 0

    println("$fromWhere-$toWhere;${++step}")
    fromWhere = "D2"
    toWhere = "D3"
    println("$fromWhere-$toWhere;${++step}")

}