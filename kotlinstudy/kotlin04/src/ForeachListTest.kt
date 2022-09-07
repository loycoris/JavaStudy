fun main() {
    val list = listOf("Jason", "Jack", "Jacky")
    for (s in list) {
        println(s)
    }

    list.forEach { println(it) }

    list.forEachIndexed { index, item -> println("$index, $item") }

    //解构语法
    val (origin, _, proxy) = list //过滤第二个变量
}