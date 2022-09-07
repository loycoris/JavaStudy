import kotlin.math.roundToInt

fun main() {

    //var number1: Int = "8.98".toInt() //java.lang.NumberFormatException: For input string: "8.98"
    var number1: Int? = "8.98".toIntOrNull() //null
    var number2: Double? = "8.98".toDoubleOrNull() //8.98
    println(number1)
    println(number2)

    println(8.956756.toInt()) //8
    println(8.956756.roundToInt()) //9 四舍五入

    println("%.2f".format(8.956756)) //8.96 四舍五入
}