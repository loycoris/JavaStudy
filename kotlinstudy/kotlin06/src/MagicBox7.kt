//vararg 可变参数
class MagicBox<T : Human>() {
    //随机产生一个对象，如果不是指定类型的对象，就通过backup函数生成一个指定类型的对象
    inline fun <reified T> randomOrBackup(backup: () -> T): T {
        val items = listOf(
                Boy("Jack", 15),
                Man("John", 35)
        )

        val random = items.shuffled().first()
        println(random)

        return if (random is T) {
            random
        } else {
            backup()
        }
    }
}

open class Human(val age: Int)

class Boy(val name: String, age: Int) : Human(age) {
    override fun toString(): String {
        return "Boy(name='$name',age='$age')"
    }
}

class Man(val name: String, age: Int) : Human(age) {
    override fun toString(): String {
        return "Man(name='$name',age='$age')"
    }
}

fun main() {
    val box1: MagicBox<Human> = MagicBox()
    //由backup函数推断出来T的类型
    val subject = box1.randomOrBackup {
        Man("Jimmy", 38)
    }
    println(subject)
}
