package exercises.level_two

import kotlin.random.Random

fun main() {

    println("Escreva um número para ver a tabuada: ")
    var number = readln()
    val convNumber = number.toInt()

    var result:Int

    for(i in 0..10) {
        result = convNumber * i
        println(number + " x " + i + " = " + result)
    }


 }

