package lesson_2

fun main() {
    val buffPercentInNumber: Float = 0.2F //20 процентов выраженное в числе
    val crystalOre = 7
    val ironOre = 11

    val countCrystalOreAfterBuff: Float = (crystalOre * buffPercentInNumber).toFloat()
    val countIronOreAfterBuff: Float = (ironOre * buffPercentInNumber).toFloat()

    println(
        """
           Бонус кристаллической руды: ${countCrystalOreAfterBuff.toInt()}
           Бонус железной руды: ${countIronOreAfterBuff.toInt()}
        """.trimIndent()
    )
}