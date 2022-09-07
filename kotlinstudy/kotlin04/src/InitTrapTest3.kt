class Player8(_name: String) {
    val playerName = initPlayerName()

    val name = _name

    private fun initPlayerName() = name
}

fun main() {
    //结果为null，why？在用initPlayerName函数初始化playerName时，
    //name属性还未完成初始化
    println(Player8("Jack").playerName)
}