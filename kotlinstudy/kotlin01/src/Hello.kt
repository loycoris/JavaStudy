const val MAX = 200
//kotlin是静态语言，在编译期决定好类型


//kotlin语言声明变量与内置数据类型
fun main() {
    println("Hello World")

    //TODO var 可读可改
    var name: String = "Jack"
    name = "Jason"
    println(name)

    //TODO val 可读不可改
    val str = "Hello World" //类型推断
    val age: Int = 5
    val sex = 'C'
    println(str)
}
