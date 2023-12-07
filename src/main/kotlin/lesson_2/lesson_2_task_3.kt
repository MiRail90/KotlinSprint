package lesson_2

fun main() {
    val hourDeparture: Byte = 9
    val minuteDeparture: Byte = 39
    val travelTime: Short = 457
    val oneHourInMinute: Byte = 60

    val arrivalTimeInMinutes: Short = (hourDeparture * oneHourInMinute + minuteDeparture + travelTime).toShort()
    val hourArrival: Byte = (arrivalTimeInMinutes / oneHourInMinute).toByte()
    val minuteArrival: Byte = (arrivalTimeInMinutes - hourArrival * oneHourInMinute).toByte()


    println("Время прибытия поезда %02d:%02d".format(hourArrival, minuteArrival))

}