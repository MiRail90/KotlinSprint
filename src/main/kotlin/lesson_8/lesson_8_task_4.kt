package lesson_8

fun main() {
    val ingredientsArray = arrayOf("перец", "соль", "мука", "вода")
    for (i in ingredientsArray) println(i)
    println("Введите ингридиент, который хотите заменить:")
    val ingredientFromUser = readln()
    if (ingredientFromUser in ingredientsArray) {
        println("Введите ингридиент, который хотите добавить:")
        val changeIngredientFromUser = readln()
        for (i in ingredientsArray) {
            if (i == ingredientFromUser) ingredientsArray[ingredientsArray.indexOf(i)] = changeIngredientFromUser
        }
        println("Готово! Вы сохранили следующий список: ")
        for (i in ingredientsArray) {
            println(i)
        }
    } else
        println("Такого ингредиента в рецепте нет")
}

