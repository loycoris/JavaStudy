import java.io.File

//匿名函数也可以是扩展函数
//() -> Unit 普通的匿名函数
//File.() -> Unit 匿名函数内部this指向一个File对象，隐式调用
public inline fun <T> T.apply(block: T.() -> Unit): T {
    block()
    return this
}

//apply函数是如何做到支持接收者对象的隐式调用的
fun main() {
    val file = File("E://java project/kotlin test file.txt")
            .apply { setReadable(true) }

    //分解apply函数
    //1.定义扩展函数
    fun File.ext(): Unit {
        setReadable(true)
    }
    //2.给block变量赋值
    val block = File::ext
    //3.传入apply函数
    File("E://java project/kotlin test file.txt")
            .apply(block)

}

//扩展函数里自带了接受者对象的隐式调用
fun String.addExt() = println(this)
fun <T> T.addExt() = println(this)

fun doSomething(fix: () -> Unit) {

}