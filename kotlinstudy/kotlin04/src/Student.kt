
/*
*初始化顺序
主构造函数里声明的属性
类级别的属性声明
init初始化块里的属性赋值和函数调用
次构造函数里的属性赋值和函数调用*/

class Student(
        _name: String,
        val age: Int //构造函数里声明的属性
) {
    var name = _name //类级别的属性声明
    var score = 10          //类级别的属性声明
    private val hobby = "music" //类级别的属性声明
    val subject: String

    init {
        println("initializing student....")
        subject = "math" //init初始化块里的属性赋值和函数调用
    }

    constructor(_name: String) : this(_name, 10) {
        score = 20 //次构造函数里的属性赋值和函数调用
    }

}

fun main() {
    Student("Jack")
}