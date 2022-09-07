fun main() {
    //flatMap 变换函数 transform
    val result = listOf(listOf(1, 2, 3), listOf(4, 5, 6)).flatMap { it }
    println(result)

    //anyResult is true, allResult is false
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    val anyResult = list.any { it.length <= 5 }
    val allResult = list.all { it.length <= 5 }
    println("anyResult is " + anyResult + ", allResult is " + allResult)

    Thread { println("Thread is running") }.start()

}