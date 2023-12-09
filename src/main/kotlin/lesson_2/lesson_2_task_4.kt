package lesson_2

fun main() {
    val buffPercent: Byte = 20
    val coefficient: Byte = 100
    val crystalOre = 7
    val ironOre = 11

    val countCrystalOreAfterBuff: Float = (crystalOre * buffPercent/coefficient).toFloat()
    val countIronOreAfterBuff: Float = (ironOre * buffPercent/coefficient).toFloat()

    println(
        """
           Бонус кристаллической руды: ${countCrystalOreAfterBuff.toInt()}
           Бонус железной руды: ${countIronOreAfterBuff.toInt()}
        """.trimIndent()
    )
}