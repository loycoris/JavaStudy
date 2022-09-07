import java.io.File

open class ConfigMap {
    //只有初始化ConfigMap类或者调用load函数时，伴生对象的内容才会载入
    //而且无论实例化ConfigMap类多少次，这个伴生对象始终只用一个实例存在
    //一个类中只能有一个伴生对象
    companion object { //伴生对象
        private const val PATH = "xxxx"
        fun load() = File(PATH).readBytes()
    }

//    fun load() = File("xxxx").readBytes()
}

fun main() {
    //static类似
    ConfigMap.load()
}