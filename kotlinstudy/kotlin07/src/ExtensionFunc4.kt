//扩展属性，提供get方法
val String.numVowels
    get() = count { "aeiou".contains(it) }

private fun <T> T.easyPrint(): T {
    println(this)
    return this
}

fun main() {
    "The people's Republic of China".numVowels.easyPrint()
}