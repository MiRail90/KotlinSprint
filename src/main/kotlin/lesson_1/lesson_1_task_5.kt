package lesson_1

fun main()
{

    val secondsFlight:Short=6480
    val hours:Int=secondsFlight/3600
    val minutes:Int=(secondsFlight-3600*hours)/60
    val seconds:Int=secondsFlight%60

    var outHours:String="$hours" //Перевожу в стринг,чтоб потом можно было проверить на двузначность и дописать ноль, если число однозначное
    var outminutes:String="$minutes"
    var outseconds:String="$seconds"

    if(hours<=9)  outHours="0$hours" //Проверка на двузначность числа, если нет дописываем ноль
    if(minutes<=9)  outminutes="0$minutes"
    if(seconds<=9)  outseconds="0$seconds"

    println("$outHours:$outminutes:$outseconds")
}

