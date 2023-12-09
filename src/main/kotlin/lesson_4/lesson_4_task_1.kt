package lesson_4

fun main() {

    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${COUNT_TABLES > bookedTablesToday},\n" +
        "Доступность столиков на завтра: ${COUNT_TABLES > bookedTablesTomorrow}"
    )
}
const val COUNT_TABLES = 13