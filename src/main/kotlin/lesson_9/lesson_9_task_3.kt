package lesson_9

fun main() {
    val receipt = listOf(2, 50, 15)
    println("Введите нужное количество порций")
    val portionCount: Int = readln().toInt()
    val receiptForUser = receipt.map { it * portionCount }
    println("На $portionCount порций вам понадобится: Яиц – ${receiptForUser[0]} молока – ${receiptForUser[1]}, сливочного масла – ${receiptForUser[2]}")
}