fun main() {
    val total: Int = "Mississippi".count()

    val totals = "Mississippi".count {
        it == 's'
//        "s".contains(it)
    }
    println(total)
    println(totals)

    //变量的类型是一个匿名函数
    /*val blessingFunction: () -> String = {
        val holiday = "New Year."
        "Happy $holiday"
    }*/

    //传入参数
    /*val blessingFunction: (String) -> String = { name ->
        val holiday = "New Year."
        "$name, Happy $holiday"
    }*/

    //一个入参可使用it代替
    /*val blessingFunction: (String) -> String = { it ->
        val holiday = "New Year."
        "$it, Happy $holiday"
    }*/

    //类型推断
    /*val blessingFunction = {
        val holiday = "New Year."
        "Happy $holiday"
    }*/

    /*val blessingFunction: (String, Int) -> String = { name, year ->
        val holiday = "New Year."
        "$name, Happy $holiday $year"
    }*/

    //两个参数时的类型推断写法
    val blessingFunction = { name: String, year: Int ->
        val holiday = "New Year."
        "$name, Happy $holiday $year"
    }


    println(blessingFunction("Jack", 2022))
}