fun main() {
    /*run函数的用法和使用场景其实和with函数是非常类似的，只是稍微做了一些语法改动而已。
    首先run函数通常不会直接调用，而是要在某个对象的基础上调用；
    其次run函数只接收一个Lambda参数，并且会在Lambda表达式中提供调用对象的上下文。
    其他方面和with函数是一样的，包括也会使用Lambda表达式中的最后一行代码作为返回值返回*/
    val result1 = "The people's Republic of China.".run { length >= 10 }

    //with函数会在Lambda表达式中提供第一个参数对象
    //的上下文，并使用Lambda表达式中的最后一行代码作为返回值返回
    //这个函数有什么作用呢？它可以在连续调用同一个对象的多个方法时让代码变得更加精简
    val result2 = with("The people's Republic of China.") {
        length >= 10
    }

    println(result1)
    println(result2)

    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result3 = with(StringBuilder()) {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result3)

    //使用run
    val list1 = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
    val result4 = StringBuilder().run {
        append("Start eating fruits.\n")
        for (fruit in list) {
            append(fruit).append("\n")
        }
        append("Ate all fruits.")
        toString()
    }
    println(result4)
}