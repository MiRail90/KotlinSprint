package lesson_1

fun main() {
    val oneHourInSeconds: Short = 3600
    val oneMinuteInSeconds: Short = 60
    val secondsFlight: Short = 6480

    val hours: Int = secondsFlight / oneHourInSeconds
    val minutes: Int = (secondsFlight - oneHourInSeconds * hours) / oneMinuteInSeconds
    val seconds: Int = secondsFlight % oneMinuteInSeconds

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}

