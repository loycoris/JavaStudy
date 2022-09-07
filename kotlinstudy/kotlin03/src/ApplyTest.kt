import java.io.File

fun main() {
    val file1 = File("E://java project/kotlin test file.txt")
    file1.setExecutable(false)
    file1.setReadable(true)
    file1.setWritable(true)

    val file2 = File("E://java project/kotlin test file.txt").apply { //隐式调用
        setExecutable(false)
        setReadable(true)
        setWritable(true)
    }
}