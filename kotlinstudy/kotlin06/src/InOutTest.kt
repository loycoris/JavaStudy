/*
* 子类泛型对象可以赋值给父类泛型对象，用out
* 父类泛型对象可以赋值给子类泛型对象，用in
*/

//out
interface Production<out T> {
    fun product(): T
}

//in
interface Consumer<in T> {
    fun consume(item: T)
}

//不变
interface ProductionConsumer<T> {
    fun product(): T
    fun consume(item: T)
}

open class Food

open class FastFood : Food()

open class Burger : FastFood()

//生产者
class FoodStore : Production<Food> {
    override fun product(): Food {
        println("Produce food.")
        return Food()
    }

}

class FastFoodStore : Production<FastFood> {
    override fun product(): FastFood {
        println("Produce FastFood.")
        return FastFood()
    }

}

class BurgerStore : Production<Burger> {
    override fun product(): Burger {
        println("Produce Burger.")
        return Burger()
    }

}

class EveryBody : Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food.")
    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat FastFood.")
    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat Burger.")
    }
}

fun main() {
    //赋值
    val production1: Production<Food> = FoodStore()
    /*
    * 在Java中该种赋值方式不支持，前面是父类，后面是子类，见GenericTypeTest.java
    * 在kotlin中可以使用该种赋值方式
    * 子类泛型对象可以赋值给父类泛型对象，用out
    */
    val production2: Production<Food> = FastFoodStore()
    production2.product()
    val production3: Production<Food> = BurgerStore()

    /*
    * 父类泛型对象可以赋值给子类泛型对象，用in
    */
    val consumer1: Consumer<Burger> = EveryBody()
    val consumer2: Consumer<Burger> = ModernPeople()
    consumer2.consume(Burger()) //输出Eat FastFood.
    //consumer2.consume(FastFood()) //编译不通过，只能传Burger
    val consumer3: Consumer<Burger> = American()

}

