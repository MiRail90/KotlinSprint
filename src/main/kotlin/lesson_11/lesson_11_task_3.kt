package lesson_11

fun main() {
    val room1 = Room()
    println("Введите никнейм нового пользователя:")
    room1.addUser(readln())
    println(
        """
        Обновите статус пользователя
        введите никнейм (нажмите Enter)
        затем выберите статус в введя цифру в соответствии со значением:
         1  = "разговаривает"
         2  = "микрофон выключен"
         3  = "пользователь заглушен"
    """.trimIndent()
    )
    room1.refreshStatus(readln(), readln().toInt())
    println("Введите никнейм пользователя, статус которого вы хотите узнать:")
    room1.userInformation(readln())
}

class Room(
    private var participants: MutableList<String> = mutableListOf(),
    private val keyStatusUser: MutableMap<Int, String> = mutableMapOf(),
) {

    fun addUser(userName: String) {
        participants.add(userName)
    }

    fun refreshStatus(userName: String, codeStatus: Int) {
        when (codeStatus) {
            1 -> keyStatusUser[participants.indexOf(userName)] = "разговаривает"
            2 -> keyStatusUser[participants.indexOf(userName)] = "микрофон выключен"
            3 -> keyStatusUser[participants.indexOf(userName)] = "пользователь заглушен"
            else -> println("Введите верный код")

        }
    }

    fun userInformation(userName: String) {
        println(userName + ' ' + keyStatusUser[participants.indexOf(userName)])
    }
}

