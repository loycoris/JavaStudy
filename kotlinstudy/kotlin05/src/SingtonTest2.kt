open class Player {
    open fun load() = "loading nothing..."
}

fun main() {
    //object 声明对象表达式，该表达式是Player的子类
    val p = object : Player() {
        override fun load() = "anonymous nothing..."
    }

    println(p.load())
}