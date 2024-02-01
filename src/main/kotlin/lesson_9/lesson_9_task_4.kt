package lesson_9

fun main() {
    println("Введите 5 ингридиентов через запятую с пробелом")
    val ingredients: String = readln()
    val splitIngredients: List<String> = ingredients.split(", ")
    println(splitIngredients.sorted())
}

