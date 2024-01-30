package lesson_8

fun main() {
    var countViewsWeek: Int = 0
    val arrayOfViews = intArrayOf(23, 26, 41, 55, 65, 40, 15)
    for (i in arrayOfViews) {
        countViewsWeek += i
    }
    print("Количество просмотров за неделю: $countViewsWeek")
}