import java.io.File

fun main() {
    var fileContents: List<String>
    val file = File("E://java project/kotlin test file.txt")
            .also { println(it.name) }
            .also { fileContents = it.readLines() }

    println(fileContents)
}