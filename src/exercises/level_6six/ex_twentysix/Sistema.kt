package exercises.level_6six.ex_twentysix

import kotlin.math.log

private var escolha: Boolean = false
private var total: Double = 0.0
private var user: String = ""
private var senha: String = ""

fun main(){
    registerUser()
    println("")

   if (login()) {
       do {
           showMenu()
           getMenuChoice()
       } while (escolha)

       calcularTotal()
   }
}

fun registerUser() {
    println("Olá, Digite o seu nome para se cadastrar no sistema do nosso restaurante.")
    user = readln()
    println("Digite agora a senha da sua conta:")
    senha = readln()
    println("Conta criada com sucesso!")

}

fun login(): Boolean {
    var sucesso: Boolean

    println("Digite suas credenciais para efetuar o login na plataforma")
    println("USUÁRIO:")
    val userLogin = readln()
    println("SENHA:")
    val userSenha = readln()

    if (userLogin != user) {
        println("Credencial Inválida")
        sucesso = false
    } else if(userSenha != senha) {
        println("Senha Inválida")
        sucesso = false
    } else {
        sucesso = true
    }

    return sucesso
}
fun getMenuChoice() {
    var userEscolha = readln().toInt()
    if (userEscolha <= 3) {
        when(userEscolha) {
            1 -> showCarte()
            2 -> {
                println("O valor total do seu pedido é:")
                println("R$" + total + " Reais")
            }
        }

    } else if (userEscolha == 4) {
        escolha = false
    } else {
        println("Escolha inválida")
    }


}

fun showMenu() {
    println("Bem vindo ao nosso restaurante!")
    println("Digite o que deseja:")
    println("1 - Cardápio")
    println("2 - Ver valor do carrinho")
    println("3 - Finalizar Compra")
    println("4 - Sair")
}

fun showCarte(): Int {
    println("--CARDÁPIO--")
    println("1 - Macarrão à bolonhesa - R$20,00")
    println("2 - Lasagna - R$30,00")
    println("3 - Escondidinho de carne - R$35,00")

    return 0
}

fun calcularTotal(){


}
