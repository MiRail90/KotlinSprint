package lesson_2

fun main() {
    val hourDeparture: Byte = 9
    val minuteDeparture: Byte = 39
    val travelTime: Short = 457
    val oneHourInMinute: Byte = 60

    val arrivalTimeInMinute: Short = (hourDeparture * oneHourInMinute + minuteDeparture + travelTime).toShort()
    val hourArrival: Byte = (arrivalTimeInMinute / oneHourInMinute).toByte()
    val minuteArrival: Byte = (arrivalTimeInMinute - hourArrival * oneHourInMinute).toByte()


    println("Время прибытия поезда %02d:%02d".format(hourArrival, minuteArrival))

}