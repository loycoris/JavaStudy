fun main() {
    val getDiscountWords = configDiscountWords()
    println(configDiscountWords())
    println(getDiscountWords("mu"))
}

fun configDiscountWords(): (String) -> String {
    val currentYear = 2027
    val hour = (1..24).shuffled().last()
    return { goodsName: String ->
        "${currentYear}年，双11${goodsName}促销倒计时：$hour 小时"
    }
}