package lesson_8

fun main() {
    val ingredientsArray = arrayOf("перец", "соль", "мука", "вода")
    println("Введите ингридиент, который хотите найти:")
    val ingredientFromUser = readln()

    for (i in ingredientsArray) {
        if (ingredientFromUser == i) {
            println("Ингредиент $ingredientFromUser в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}

