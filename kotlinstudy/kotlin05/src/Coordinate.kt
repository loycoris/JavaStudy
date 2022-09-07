//data 修饰数据类，重写了toString和equals方法
data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0
}

fun main() {
    println(Coordinate(10, 20))
    // == 比较的是内容，相当于equals，Any默认实现===，比较引用
    // === 比较的是引用，是否指向同一个内存区域
    println(Coordinate(10, 20) == Coordinate(10, 20))

    val (x, y) = Coordinate(10, 20) //解构
    println("$x,$y")
}