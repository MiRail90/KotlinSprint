package lesson_1

fun main() {
    val oneHourInSeconds: Short = 3600
    val oneMinuteInSeconds: Short = 60
    val secondsFlight: Short = 6480

    val hours: Int = secondsFlight / oneHourInSeconds
    val minutes: Int = (secondsFlight - oneHourInSeconds * hours) / oneMinuteInSeconds
    val seconds: Int = secondsFlight % oneMinuteInSeconds

    val outHours: String = String.format("%02d", hours)
    val outMinutes: String = String.format("%02d", minutes)
    val outSeconds: String = String.format("%02d", seconds)


    println("$outHours:$outMinutes:$outSeconds")

}

