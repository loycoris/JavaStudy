fun main() {
    val result = listOf(3, 2, 1).first().let {
        it * it
    }
    println(result)

    println(formatGreeting("Jack"))
}

fun formatGreeting(guestName: String?): String {
    return guestName?.let { "Welcome, $it." } ?: "What's your name"
}