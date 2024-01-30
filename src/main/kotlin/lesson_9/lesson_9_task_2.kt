package lesson_9

fun main() {
    val ingredientsList = mutableListOf("перец", "соль", "мука")
    println(
        """
        В рецепте есть базовые ингредиенты: $ingredientsList  
        "Желаете добавить еще? (да/нет)
            """.trimIndent()
    )

    var answer: String = readln()
    while (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        ingredientsList.add(readln())
        println("Желаете добавить еще? (да/нет)")
        answer = readln()
    }
    println("Теперь в рецепте есть следующие ингредиенты: $ingredientsList")
}