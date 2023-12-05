package lesson_1

fun main()
{
    val year:UShort = 1961U
    var hour:String="09"
    var minute:String="07"
    println(
        """  
            Взлет:
            $year 
            $hour 
            $minute
        """.trimIndent())

    hour="10"
    minute="55"
    println("Посадка: $hour:$minute")

}