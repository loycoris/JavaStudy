class Player4 {
    //延迟初始化
    lateinit var equipment: String

    fun ready() {
        equipment = "sharp knife"
    }

    fun battle() {
        if (::equipment.isInitialized)
            println(equipment)
    }
}

fun main() {
    val p = Player4()
    p.ready()
    p.battle()
}