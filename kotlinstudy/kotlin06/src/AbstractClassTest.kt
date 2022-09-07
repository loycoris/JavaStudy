abstract class Gun(var range: Int) {

    protected fun doSomething() {
        println("doSomething...")
    }

    abstract fun pullTrigger(): String
}

//多重继承 java不允许同时继承两个父类，可实现多个接口

class AK47(var price: Int) : Gun(range = 500) {
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }

}