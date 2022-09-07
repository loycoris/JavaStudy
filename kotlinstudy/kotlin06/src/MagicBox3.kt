/*
class MagicBox<T>(item: T) {
    var available = false
    private var subject: T = item

    fun fetch(): T? {
        return subject.takeIf { available }
    }

    //业务，把元素进行修改
    fun <R> fetch(subjectModFunction: (T) -> R): R? {
        return subjectModFunction(subject).takeIf { available }
    }
}

class Boy(val name: String, val age: Int)

class Man(val name: String, val age: Int)

class Dog(val weight: Int)

fun main() {
    val magicBox1 = MagicBox(Boy("Jack", 15))
    val magicBox2 = MagicBox(Dog(20))

    magicBox1.available = true
    magicBox1.fetch()?.run {
        println("you find $name")
    }

    val man = magicBox1.fetch {
        Man(it.name, it.age.plus(15))
    }
    println(man)

    magicBox2.available = false
    println(magicBox2.fetch())
}*/
