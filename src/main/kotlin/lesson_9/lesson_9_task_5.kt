package lesson_9


fun main() {
    println("Введите 5 ингридиентов (после каждого нажать \"Enter\"")
    val ingredients: MutableSet<String> = mutableSetOf()
    val countIngredients = 0..4
    for (i in countIngredients) {
        ingredients.add(readln())
    }
    val sortedIngredients = ingredients.sorted().joinToString()
    println(sortedIngredients.replaceFirstChar(Char::uppercaseChar))
    }