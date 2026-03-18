package exercises

fun main() {

    println("Digite um número inteiro")
    val intNumber = readln()
    val convIntNumber = intNumber.toInt()

    if(convIntNumber % 2 == 0) {
        println("O número " + convIntNumber + " é par!")
    } else {
        println("O número " + convIntNumber + " é ímpar!")
    }


}