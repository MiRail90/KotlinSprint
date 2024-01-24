package lesson_8

fun main() {
    println("Введите количество планируемых ингредиентов: ")
    val countIngredients: Int = readln().toInt()
    val ingredientsArray = arrayOfNulls<String>(countIngredients)
    for (i in 0..countIngredients - 1) {
        println("Введите ингредиент ${i + 1}: ")
        ingredientsArray[i] = readln()
    }
    println("Список ингредиентов: ")
    for (i in ingredientsArray) println(i)
}