/*
class MagicBox<T>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { available }
    }
}

class Boy(val name: String, val age: Int)

class Dog(val weight: Int)

fun main() {
    val magicBox1 = MagicBox(Boy("Jack", 20))
    val magicBox2 = MagicBox(Dog(20))

    magicBox1.available = true
    magicBox1.fetch()?.run {
        println("you find $name")
    }

    magicBox2.available = false
    println(magicBox2.fetch())
}*/
