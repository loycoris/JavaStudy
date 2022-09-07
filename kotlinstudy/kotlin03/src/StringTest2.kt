fun main() {
    val str1 = "Jason"
    val str2 = "jason".capitalize()

    println("$str1,$str2")
    println(str1 == str2) //比较字符串内容
    println(str1 === str2) //比较是不是同一个对象  true 同一个引用 val str2 = "jason"
    //val str2 = "jason".capitalize() false 不是同一个引用

    "The people's Republic of China.".forEach { print("$it *") } //遍历
}

