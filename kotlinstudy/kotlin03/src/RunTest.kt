import java.io.File

fun main() {
    val file = File("E://java project/kotlin test file.txt")
    val result = file.run {
        readText().contains("great")
    }
    println(result)

    val isLong = "The people's Republic of China.".run(::isLong)
    println(isLong)

    "The people's Republic of China.".run(::isLong)
            .run(::showMessage)
            .run(::println)

}

fun isLong(name: String) = name.length >= 10

fun showMessage(isLong: Boolean): String {
    return if (isLong) {
        "Name is too long"
    } else {
        "Please rename"
    }
}