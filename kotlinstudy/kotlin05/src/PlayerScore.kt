class PlayerScore(var experience: Int, var level: Int) {
    operator fun component1() = experience //解构声明
    operator fun component2() = level
}

fun main() {
    var (x, y) = PlayerScore(10, 20)
    println("$x,$y")
}