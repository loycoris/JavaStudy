//枚举类主构造函数
enum class Direction2(private val coordinate: Coordinate) {
    //枚举类的构造函数带参数，所以定义每个枚举常量时，要传入Coordinate对象，调用构造函数
    EAST(Coordinate(1, 0)), //枚举类属性
    WEST(Coordinate(-1, 0)),
    SOUTH(Coordinate(-1, 0)),
    NORTH(Coordinate(1, 0));

    fun updateCoordinate(playerCoordinate: Coordinate) =
            Coordinate(coordinate.x + playerCoordinate.x,
                    coordinate.y + playerCoordinate.y)
}

fun main() {
    println(Direction2.EAST.updateCoordinate(Coordinate(10, 20)))
}