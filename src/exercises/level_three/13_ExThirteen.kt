package exercises.level_three

fun main() {

    println("Type the elements of the list")
    val userInputL = readln().split(' ').map {it}
    val frequencyCount = userInputL.groupingBy { it }.eachCount()

    println("The frequency of the items in the list is: ")
    println(frequencyCount)
}