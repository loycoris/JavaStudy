//可空类扩展
infix fun String?.printWithDefault(default: String) = println(this ?: default)

fun main() {
    val nullableString: String? = null
    nullableString.printWithDefault("abc")
    nullableString printWithDefault "abc" //infix关键字 点操作和一对括号都可以不写
}