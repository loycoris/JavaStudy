data class Student(val name: String,
                   val age: Int //构造函数里声明的属性
) {
    private val hobby = "music" //类级别的属性声明
    val subject: String
    var score = 0

    init {
        println("initializing student....")
        subject = "math" //init初始化块里的属性赋值和函数调用
    }

    constructor(_name: String) : this(_name, 10) {
        score = 10
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age, hobby='$hobby', subject='$subject', score=$score)"
    }

}

fun main() {
    val s = Student("Jack")
    val copy = s.copy("Rose")

    println(s)
    println(copy)
}