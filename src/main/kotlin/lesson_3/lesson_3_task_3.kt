package lesson_3

fun main() {
    val constant = 3
    var beginNumber = 0

    println(
        """
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
        $constant х ${++beginNumber} = ${constant * (beginNumber)} 
    """.trimIndent()
    )
}