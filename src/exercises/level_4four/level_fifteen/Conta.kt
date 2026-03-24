package exercises.level_4four.level_fifteen

class Conta(val nome: String, var saldo: Double) {

    var valor: Double = 0.0

    fun depositar() {
        println("Digite o valor a ser depositado:")
        valor = readln().toDouble()
        if (valor < 0) {
            println("Valor inválido")
        } else {
            saldo += valor
        }
    }

    fun sacar() {
        println("O valor disponível para saque é ${saldo}")
        println("Digite o valor que deseja sacar: ")
        valor = readln().toDouble()

        if(valor > saldo || valor < 0){
            println("Valor inválido")
        } else {
            saldo -= valor
        }
        println("Operação finalizada.")
    }
}