import kotlin.math.absoluteValue

class Player2(
        _name: String, //临时变量可用下划线开头定义
        var age: Int,
        var isNormal: Boolean
) {
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value.trim()
        }

    //次构造函数
    constructor(name: String) : this(name, age = 10, isNormal = false)

    constructor(name: String, age: Int) : this(name, age, isNormal = false) {
        this.name = name.toUpperCase()
    }
}

fun main() {
    val p = Player2("Jack", 20, true)
//    p.name = "rose"

    val p2 = Player2("rose")

    val p3 = Player2("jacky", 20)
    println(p3.name)
}