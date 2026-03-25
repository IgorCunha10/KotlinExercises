package exercises.level_5five.ex_eighteen

fun main() {

   println("Digite o usuário e senha para criação da conta: ")

    val contaUsuario = Conta(readln().toString(),
        readln().toString())

    println("Conta Criada com sucesso!")

    println("Digite agora o usuário para efetuar o login no sistema: ")
    var loginUsuario = readln().toString()

    println("Digite a senha para efetuar o login no sistema: ")
    var senhaUsuario = readln().toString()

    if (loginUsuario != contaUsuario.usuario || contaUsuario.senha != senhaUsuario) {
        println("Credenciais inválidas. Tente novamente mais tarde!")
    } else {
        println("Login efetuado com sucesso!")
    }

}







