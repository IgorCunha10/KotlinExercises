package exercises

fun main() {

    println("Digite um número inteiro")
    val number = readln()
    var numberConv = number.toInt()

    if (numberConv < 0) {
        println("O número " + numberConv + " É negativo")
    } else if(numberConv == 0 ) {
        println("O número é digitado é zero")
    } else {
        println("O número digitado é positivo")
    }

}