fun main() {
/*     val set = setOf("Jason", "Jack", "Jacky", "Jack")
     println(set.elementAt(2))
     set.forEach { println(it) }
    println(set)*/

    val mutableSet = mutableSetOf("Jason", "Jack", "Jacky", "Jack")
    mutableSet += "Jimmy"
    println(mutableSet)

    val list = listOf("Jason", "Jack", "Jacky", "Jack")
            .toSet()
            .toList()
    println(list)

    println(listOf("Jason", "Jack", "Jacky", "Jack").distinct()) //去重快捷函数
}