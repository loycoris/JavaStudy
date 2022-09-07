import java.io.File

fun main() {
    val result = File("E://java project/kotlin test file.txt")
            .takeIf { it.exists() && it.canRead() }
            ?.readText()
    println(result)

    val result1 = File("E://java project/kotlin test file.txt")
            .takeUnless { it.isHidden }
            ?.readText()
    println(result1)
}