package exercises.level_6six.ex_twentysix

private var escolha: Boolean = false

fun main(){
    registerUser()
    println("")

    do {
        showMenu()
        getChoice()
    }while (escolha)

}

fun registerUser() {
    println("Olá, Digite o seu nome para se cadastrar no sistema do nosso restaurante.")
    val user = readln()
    println("Digite agora a senha da sua conta:")
    val senha = readln()
    println("Conta criada com sucesso!")

}

fun getChoice() {
    var userEscolha = readln().toInt()
    if (userEscolha <= 3) {
        when(userEscolha) {
            1 -> showCarte()
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

fun showCarte() {
    println("1 - Macarrão à bolonhesa")
    println("2 - Lasagna")
    println("3 - Escondidinho de carne")

}
