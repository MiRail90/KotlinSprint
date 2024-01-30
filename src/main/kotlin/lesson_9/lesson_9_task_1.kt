package lesson_9

fun main() {
    val ingredientsList = listOf("перец", "соль", "мука", "вода")
    println("В рецепте есть следующие ингредиенты: $ingredientsList")
    ingredientsList.forEach { println(it) }
}