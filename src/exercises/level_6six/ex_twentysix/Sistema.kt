package exercises.level_6six.ex_twentysix

private var escolha: Boolean = false
private var total: Double = 0.0

fun main(){
    registerUser()
    println("")

    do {
        showMenu()
        getMenuChoice()
    }while (escolha)

    calcularTotal()

}

fun registerUser() {
    println("Olá, Digite o seu nome para se cadastrar no sistema do nosso restaurante.")
    val user = readln()
    println("Digite agora a senha da sua conta:")
    val senha = readln()
    println("Conta criada com sucesso!")

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
    println("2 - Finalizar Compra")
    println("3 - Ver valor do carrinho")
    println("4 - Sair")
}

fun showCarte(): Int {
    println("1 - Macarrão à bolonhesa - R$20,00")
    println("2 - Lasagna - R$30,00")
    println("3 - Escondidinho de carne - R$35,00")

    return 0
}

fun calcularTotal(){


}
