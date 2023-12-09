package lesson_4

fun main() {
    val trainingDay = 5


    println(
        """
        Упражнения для рук:${trainingDay % 2 != CHECK_PARITY_NUMBER}
        Упражнения для ног:${trainingDay % 2 == CHECK_PARITY_NUMBER}
        Упражнения для спины:${trainingDay % 2 == CHECK_PARITY_NUMBER}
        Упражнения для пресса:${trainingDay % 2 != CHECK_PARITY_NUMBER}
    """.trimIndent()
    )


}

const val CHECK_PARITY_NUMBER = 0

