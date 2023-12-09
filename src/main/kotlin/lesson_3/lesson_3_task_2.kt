package lesson_3

fun main() {
    var lastName = "Сидорова"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 22

    println("$lastName $firstName $patronymic, $age")

    lastName = "Андреева"
    age = 20

    println("$lastName $firstName $patronymic, $age")
}