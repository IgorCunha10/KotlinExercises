package exercises.level_5five.ex_twenty

fun main() {

    println("Digite um lista de números")

    val numsUsuario = readln().split(' ').map { it.toInt() }
    println(numsUsuario)

    val doubleNums = numsUsuario.map { it * 2 }
    println("O dobro dos números digitados é: $doubleNums")


}