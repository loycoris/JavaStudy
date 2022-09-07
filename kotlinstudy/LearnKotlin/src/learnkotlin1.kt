var content: String? = "hello"
fun main() {
    if (content != null) {
        printUpperCase()
    }
}
fun printUpperCase() {
    val upperCase = content?.toUpperCase()
    println(upperCase)
}