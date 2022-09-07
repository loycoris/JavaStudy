class Player3(
        _name: String, //临时变量可用下划线开头定义
        var age: Int = 20,
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

    //初始化代码块，会在构造类实例时执行，即构建对象的时候执行
    init {
        require(age > 0) { "age must be positive" }
        require(name.isNotBlank()) { "player must have a name" }
    }
}

fun main() {
    val p1 = Player3("Jack", isNormal = false)
    println(p1.age)
}