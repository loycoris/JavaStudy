fun main() {
    var str: String? = "butterfly" //? 安全调用操作符
//    str = ""
//    println(str?.capitalize())
    /*str = str?.let {
        //feikongbai
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "butterfly"
        }
    }*/

//    str = null
//    println(str!!.capitalize()) // !! 非空断言操作符,若为空，则抛出异常

    if (str != null) {
        str = str.capitalize()
    } else {
        println("is null")
    }

    str = str?.capitalize()?.plus(" is great.")

    str = str ?: "Jack" // ?:空合并操作符

    str = null
    str = str?.let { it.capitalize() } ?: "butterfly"
    println(str)
}