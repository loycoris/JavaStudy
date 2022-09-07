fun Int.isPrime(): Boolean {
    (2 until this).map {
        if (this % it == 0) {
            return false
        }
    }
    return true
}

fun main() {

    val toList = (1..5000).toList().filter { it.isPrime() }.take(1000)
    println(toList.size)

    val onePrimes = generateSequence(2) { value ->
        value + 1
    }.filter { it.isPrime() }.take(1000)
    println(onePrimes.toList().size)
}