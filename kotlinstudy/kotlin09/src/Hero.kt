@file:JvmName("Hero")

import java.io.IOException
import kotlin.jvm.Throws

fun main() {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    //平台类型 String！
    val level = adversary.determineFriendshipLevel()
    level?.toLowerCase()

    println(adversary.hitPoints.javaClass)

    println(adversary.hitPoints) //相当于调用Java get方法

    adversary.hitPoints = 27432  //相当于调用Java set方法

    handOverFood("apple")

    adversary.extendHandInFriendship()
}

fun makeProclamation() = "Greeting,beast!"


@JvmOverloads
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Mmmm....you hand over some delicious $leftHand and $rightHand")
}

@Throws(IOException::class)
fun acceptApology() {
    throw IOException()
}

val translator = { uttrenrance: String ->
    println(uttrenrance.toLowerCase().capitalize())
}