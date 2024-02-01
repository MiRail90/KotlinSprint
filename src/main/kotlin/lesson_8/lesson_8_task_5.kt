package lesson_8

fun main() {
    println("Введите количество ингредиентов и ингридиенты рецепта: ")
    val ingredientsArray: Array<String> = Array(readln().toInt()) { readln() }
    println("Список ингредиентов: ${ingredientsArray.contentToString()}")
}