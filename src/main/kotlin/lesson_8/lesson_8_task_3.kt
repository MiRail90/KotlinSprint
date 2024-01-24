package lesson_8

fun main() {
    val ingredientsArray = arrayOf("перец", "соль", "мука", "вода")
    println("Введите ингридиент, который хотите найти:")
    val ingredientFromUser = readln()
    if (ingredientFromUser in ingredientsArray) {
        println("Ингредиент $ingredientFromUser в рецепте есть")
    } else
        println("Такого ингредиента в рецепте нет")
}