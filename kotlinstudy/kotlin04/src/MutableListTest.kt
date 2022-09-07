fun main() {
    val mutableList = mutableListOf("Jason", "Jack", "Jacky") //可变列表
//    mutableList.add("Jimmy")
//    mutableList.remove("Jack")
//
//    println(mutableList)

    listOf("Jason", "Jack", "Jacky").toMutableList()
    mutableListOf("Jason", "Jack", "Jacky").toList()

    mutableList += "Jimmy"
    mutableList -= "Jason"

    mutableList.removeIf { it.contains("Jack") }
    println(mutableList)
}