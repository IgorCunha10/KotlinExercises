package exercises.level_one

fun main() {

    println("Essa é uma calculadora simples")

    println("Digite o primeiro número:")
    val firstNumber = readln()
    val firstNumberConv = firstNumber.toDouble()

    println("Ótimo! Agora digite o segundo número")
    val secondNumber = readln()
    val secondNumberConv = secondNumber.toDouble()

    println("Agora você precisa me dizer qual operação você quer que eu realize com " +
            "estes números")







    println("1 - Soma")
    println("2 - Subtração")
    println("3 - Multiplicação")
    println("4 - Divisão")

    val operation = readln()
    val operationResult: Double

    val selectedOperation = operation.toInt()

    when (selectedOperation) {
        1 -> { operationResult = firstNumberConv + secondNumberConv
        println(operationResult)}

        2 -> {
            operationResult = firstNumberConv - secondNumberConv
            println(operationResult)
        }

        3 -> {
            operationResult = firstNumberConv * secondNumberConv
            println(operationResult)
        }
        4 -> {
            if (secondNumberConv == 0.0) {
                 println("Não é possível efetuar a divisão") }
            else {
                 operationResult = firstNumberConv / secondNumberConv
                 println(operationResult) }
        }

        else -> println("Operação Inválida")


    }

}