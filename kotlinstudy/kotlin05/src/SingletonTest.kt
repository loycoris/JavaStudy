//object 修饰符，声明单例类
object ApplicationConfig {
    init {
        println("ApplicationConfig loading...")
    }

    fun doSomething() {
        println("doSomething")
    }
}

fun main() {
    //ApplicationConfig 既是类名，又是实例化之后的对象名
    ApplicationConfig.doSomething()

    /*
    * ApplicationConfig@7f31245a
    * ApplicationConfig@7f31245a
    * 同一个对象
    */
    println(ApplicationConfig)
    println(ApplicationConfig)
}