fun main() {
    //zip 合并函数
    val employees = listOf("Jack", "Jason", "Tommy")
    val shirtSize = listOf("large", "x-large", "medium")

    val zip = employees.zip(shirtSize).toMap()
    println(zip)

    val foldValue = listOf(1, 2, 3, 4).fold(0) { accmulator, number ->
        println("Accumulator value:$accmulator")
        accmulator + number * 3
    }

    println("Final value: $foldValue")
}