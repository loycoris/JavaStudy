fun main() {
    val getDiscountWords = { goodName: String, hour: Int ->
        val currentYear = 2027
        "${currentYear}年，双11${goodName}促销倒计时：$hour 小时"
    }
    showOnBoard("huazhu",getDiscountWords)
}

//具名函数
private inline fun showOnBoard(goodsName: String, getDiscountWords: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodsName, hour))
}
