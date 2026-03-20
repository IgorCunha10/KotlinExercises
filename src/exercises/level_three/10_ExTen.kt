package exercises.level_three

fun main() {

    average()

}

fun average() {
    println("Escreva os números que você quer calcular a média: ")
    val userNum = readln().split(' ').map {it.toDouble()}

    val sumUserNum = userNum.sum()

    val avg = sumUserNum / userNum.count()
    val formatedAvg = "%.2f".format(avg)

    println("A média dos números enviados é: " + formatedAvg)

}
