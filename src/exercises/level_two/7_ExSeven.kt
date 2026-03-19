package exercises.level_two

fun main() {

    println("Type a number for the sum from 1 to n: ")
    val number = readln()
    val numberConv = number.toInt()

    var sum = 0

    for(i in 1..numberConv) {
        sum = sum + i
    }

    println("The sum from 1 to " + number + " is: ")
    println(sum)

}