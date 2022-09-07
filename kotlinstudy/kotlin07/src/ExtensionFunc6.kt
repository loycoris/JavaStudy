import com.jason.kotlin.extension.randomTake as randomizer

//as关键字取别名
fun main() {
    val list = listOf("Jason", "Jack", "Tom")
    val set = listOf("Jason", "Jack", "Tom")

    println(list.randomizer())
}