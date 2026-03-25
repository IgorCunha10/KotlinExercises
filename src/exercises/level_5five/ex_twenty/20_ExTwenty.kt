package exercises.level_5five.ex_twenty

fun main() {

    println("Digite um lista de números")

    val numsUsuario = readln().split(' ').map { it.toDouble() }
    println(numsUsuario)

    val doubleNums = numsUsuario.map { it * 2 }
    println("O dobro dos números digitados é: $doubleNums")

    val sumNums = numsUsuario.reduce { accumulator, element ->
        accumulator + element
    }

    val sumNumsFormatted = "%.2f".format(sumNums)

    println("A soma dos números enviados é: $sumNumsFormatted")
}