import kotlin.math.max

fun main() {
    val a = 10
    println("a = " + a)

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val maxLengthFruit = list.maxByOrNull { fruit: String -> fruit.length }
}

//fun largerNumber(num1: Int, num2: Int): Int = max(num1, num2)

fun largerNumber(num1: Int, num2: Int): Int {
    val value = if (num1 > num2)
        num1
    else
        num2

    return value
}

fun getScore(name: String) = if (name == "Tom") 86
else if (name == "Jim") 77
else if (name == "Jack") 95
else if (name == "Lily") 100
else 0
