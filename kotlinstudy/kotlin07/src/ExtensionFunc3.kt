//泛型扩展函数
fun String.addExt(amount: Int = 1) = this + "!".repeat(amount)

private fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main() {
    "abc".easyPrint().addExt(2).easyPrint()

    val i = "testLet".let {
        println(it)
        println(it)
        println(it)
    }
}