fun main() {
    val list = listOf("Jason", "Jack", "Jacky") //只读列表
//    println(list[3])
    println(list.getOrElse(3) { "Unknown" })
    println(list.getOrNull(3))
    println(list.getOrNull(3) ?: "Unknown")
}