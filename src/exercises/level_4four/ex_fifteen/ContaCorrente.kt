package exercises.level_4four.ex_fifteen

fun main() {

    var contaUsuario = Conta("Igor", 0.0)
    var escolha: Boolean = false

    do {

    println("Bem vindo ${contaUsuario.nome}!")
    println("Qual operação você deseja realizar")
    println("1 - Extrato")
    println("2 - Depositar")
    println("3 - Sacar")
    var operacao = readln().toString()

    when(operacao) {
        "1" -> println("O saldo é ${contaUsuario.saldo}")
        "2" -> contaUsuario.depositar()
        "3" -> contaUsuario.sacar()
        else -> println("Operação inválida")
    }
    println("Deseja continuar? \n1 - Sim \n2 - Não")
    var lerEscolha = readln().toString()
    when (lerEscolha) {
        "1" -> escolha = true
        "2" -> escolha = false
    }
    } while (escolha)

}