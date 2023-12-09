package lesson_4

fun main() {
    val countTables = 13
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${countTables > bookedTablesToday},\n" +
        "Доступность столиков на завтра: ${countTables > bookedTablesTomorrow}"
    )
}