package lesson_8

fun main() {
    val ingredientsArray = arrayOf("перец", "соль", "мука", "вода")
    ingredientsArray.forEach { println(it) }
    println("Введите ингридиент, который хотите заменить:")
    val ingredientFromUser = readln()
    if (ingredientFromUser in ingredientsArray) {
        println("Введите ингридиент, который хотите добавить:")
        ingredientsArray[ingredientsArray.indexOf(ingredientFromUser)] = readln()
        println("Готово! Вы сохранили следующий список: ${ingredientsArray.contentToString()}")
    } else println("Вашего ингридиента нет в рецепте")
}

