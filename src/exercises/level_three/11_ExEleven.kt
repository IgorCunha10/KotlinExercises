package exercises.level_three

fun main() {

    println("Digite uma lista de números: ")

    val userList = readln().split(' ').map { it.toInt() }
    val evenNumbers = userList.filter {it % 2 == 0}

    println("Os números pares são: " + evenNumbers)

}